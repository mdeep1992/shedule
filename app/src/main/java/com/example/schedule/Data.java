package com.example.schedule;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {
    @SerializedName("provider_id")
    @Expose
    private String providerId;
    @SerializedName("pid")
    @Expose
    private String pid;
    @SerializedName("device_language")
    @Expose
    private String deviceLanguage;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("facility_id")
    @Expose
    private String facilityId;
    @SerializedName("slot")
    @Expose
    private List<Slot> slot = null;
    @SerializedName("slot_count")
    @Expose
    private Integer slotCount;
    @SerializedName("profile")
    @Expose
    private String profile;

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDeviceLanguage() {
        return deviceLanguage;
    }

    public void setDeviceLanguage(String deviceLanguage) {
        this.deviceLanguage = deviceLanguage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public List<Slot> getSlot() {
        return slot;
    }

    public void setSlot(List<Slot> slot) {
        this.slot = slot;
    }

    public Integer getSlotCount() {
        return slotCount;
    }

    public void setSlotCount(Integer slotCount) {
        this.slotCount = slotCount;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;

    }
}
