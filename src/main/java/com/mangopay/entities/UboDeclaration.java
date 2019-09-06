package com.mangopay.entities;

import com.google.gson.annotations.SerializedName;
import com.mangopay.core.EntityBase;
import com.mangopay.core.enumerations.UboDeclarationStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/**
 * UBO declaration entity.
 */
public class UboDeclaration extends EntityBase {

    /**
     * Date of process.
     */
    @SerializedName("ProcessedDate")
    private int processedDate;

    /**
     * Declaration status.
     */
    @SerializedName("Status")
    private UboDeclarationStatus status;

    /**
     * Reason why the declaration was refused.
     */
    @SerializedName("Reason")
    private String reason;

    /**
     * Explanation of why the declaration was refused.
     */
    @SerializedName("Message")
    private String message;

    /**
     * Listed representations of natural users declared as UBOs.
     * When transmitting a UBO declaration (POST / PUT), must be an array of
     * IDs (string) of the users to be declared as UBOs.
     * In a received UBO declaration (GET), will be an array of representations
     * of the natural users declared as UBOs.
     */
    @SerializedName("Ubos")
    private ArrayList<Ubo> ubos = new ArrayList<>();

    public int getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(int processedDate) {
        this.processedDate = processedDate;
    }

    public UboDeclarationStatus getStatus() {
        return status;
    }

    public void setStatus(UboDeclarationStatus status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Ubo> getUbos() {
        return ubos;
    }

    public void setUbos(ArrayList<Ubo> ubos) {
        this.ubos = ubos;
    }

    @Override
    public ArrayList<String> getReadOnlyProperties() {
        ArrayList<String> props = super.getReadOnlyProperties();

        props.add("ProcessedDate");
        props.add("Reason");
        props.add("Message");

        return props;
    }

    @Override
    public Map<String, Type> getSubObjects() {

        Map<String, Type> result = super.getSubObjects();

		// TODO: this is an issue, had to comment this out, otherwise parsing does not work
		// result.put("Ubos", Ubo.class);

        return result;
    }


}
