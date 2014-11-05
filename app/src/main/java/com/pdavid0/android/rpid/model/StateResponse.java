package com.pdavid0.android.rpid.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phil on 11/4/2014.
 */
public class StateResponse {

    @SerializedName("player_impl")
    @Expose
    private String playerImpl;
    @SerializedName("player_state")
    @Expose
    private String playerState;
    @SerializedName("queue_current_item")
    @Expose
    private String queueCurrentItem;
    @SerializedName("queue_length")
    @Expose
    private Integer queueLength;
    @SerializedName("queue_item_position")
    @Expose
    private Integer queueItemPosition;
    @SerializedName("queue_content")
    @Expose
    private List<String> queueContent = new ArrayList<String>();

    /**
     * @return The playerImpl
     */
    public String getPlayerImpl() {
        return playerImpl;
    }

    /**
     * @param playerImpl The player_impl
     */
    public void setPlayerImpl(String playerImpl) {
        this.playerImpl = playerImpl;
    }

    /**
     * @return The playerState
     */
    public String getPlayerState() {
        return playerState;
    }

    /**
     * @param playerState The player_state
     */
    public void setPlayerState(String playerState) {
        this.playerState = playerState;
    }

    /**
     * @return The queueCurrentItem
     */
    public String getQueueCurrentItem() {
        return queueCurrentItem;
    }

    /**
     * @param queueCurrentItem The queue_current_item
     */
    public void setQueueCurrentItem(String queueCurrentItem) {
        this.queueCurrentItem = queueCurrentItem;
    }

    /**
     * @return The queueLength
     */
    public Integer getQueueLength() {
        return queueLength;
    }

    /**
     * @param queueLength The queue_length
     */
    public void setQueueLength(Integer queueLength) {
        this.queueLength = queueLength;
    }

    /**
     * @return The queueItemPosition
     */
    public Integer getQueueItemPosition() {
        return queueItemPosition;
    }

    /**
     * @param queueItemPosition The queue_item_position
     */
    public void setQueueItemPosition(Integer queueItemPosition) {
        this.queueItemPosition = queueItemPosition;
    }

    /**
     * @return The queueContent
     */
    public List<String> getQueueContent() {
        return queueContent;
    }

    /**
     * @param queueContent The queue_content
     */
    public void setQueueContent(List<String> queueContent) {
        this.queueContent = queueContent;
    }

    @Override
    public String toString() {
        return getPlayerState();
    }
}
