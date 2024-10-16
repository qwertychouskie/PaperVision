package io.github.deltacv.papervision.engine.message

abstract class PaperVisionEngineMessageBase : PaperVisionEngineMessage {

    companion object {
        private var idCount = -1

        @Synchronized fun nextId(): Int {
            idCount++
            return idCount
        }
    }

    @Transient
    private val onResponseCallbacks = mutableListOf<OnResponseCallback>()

    override val id = nextId()

    override fun acceptResponse(response: PaperVisionEngineMessageResponse) {
        for(callback in onResponseCallbacks) {
           callback.onResponse(response)
        }
    }

    override fun onResponse(callback: OnResponseCallback): PaperVisionEngineMessageBase {
        onResponseCallbacks.add(callback)
        return this
    }

    inline fun <reified T : PaperVisionEngineMessageResponse> onResponseWith(crossinline callback: (T) -> Unit) =
        onResponse {
            if(it is T) {
                callback(it)
            }
        }.run { this }

    override fun toString() = "MessageBase(type=\"${this::class.java.typeName}\", id=$id)"

}