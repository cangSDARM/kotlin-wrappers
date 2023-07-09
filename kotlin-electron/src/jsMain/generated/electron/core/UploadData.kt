package electron.core

import node.buffer.Buffer


external interface UploadData {
// Docs: https://electronjs.org/docs/api/structures/upload-data
    /**
     * UUID of blob data. Use ses.getBlobData method to retrieve the data.
     */
    var blobUUID: String?

    /**
     * Content being sent.
     */
    var bytes: Buffer

    /**
     * Path of file being uploaded.
     */
    var file: String?
}