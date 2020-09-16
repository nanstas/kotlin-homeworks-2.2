package ru.netology

sealed class Attachments {
    abstract val type: String
}
data class VideoAttachment(override val type: String, val video: Video) : Attachments()
data class AudioAttachment(override val type: String, val audio: Audio) : Attachments()
data class PhotoAttachment(override val type: String, val photo: Photo) : Attachments()
data class DocAttachment(override val type: String, val doc: Doc) : Attachments()
data class LinkAttachment(override val type: String, val link: Link) : Attachments()