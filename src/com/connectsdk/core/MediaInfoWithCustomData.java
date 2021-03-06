package com.connectsdk.core;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by gomino on 7/8/15.
 */
public class MediaInfoWithCustomData extends MediaInfo {

    public static final int STREAM_TYPE_NONE = 0;
    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final long UNKNOWN_DURATION = -1L;

    private JSONObject mCustomData;
    private JSONObject mCustomDataForLoad;
    private int mStreamType = STREAM_TYPE_BUFFERED;

    public MediaInfoWithCustomData(String url, String mimeType, String title, String description) {
        super(url, mimeType, title, description);
    }

    public MediaInfoWithCustomData(String url, String mimeType, String title, String description, List<ImageInfo> allImages) {
        super(url, mimeType, title, description, allImages);
    }

    public JSONObject getCustomData() {
        return mCustomData;
    }

    public void setCustomData(JSONObject customData) {
        this.mCustomData = customData;
    }

    public JSONObject getCustomDataForLoad() {
        return mCustomDataForLoad;
    }

    public void setCustomDataForLoad(JSONObject customDataForLoad) {
        this.mCustomDataForLoad = customDataForLoad;
    }

    public int getStreamType() {
        return mStreamType;
    }

    public void setStreamType(int streamType) {
        this.mStreamType = streamType;
    }
}
