package com.alibaba.fastjson.support.geo;

import com.alibaba.fastjson.annotation.JSONType;
import java.util.LinkedHashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

@JSONType(orders = {"type", AgooConstants.MESSAGE_ID, "bbox", "coordinates", "properties"}, typeName = "Feature")
/* loaded from: classes3.dex */
public class Feature extends Geometry {
    private Geometry geometry;

    /* renamed from: id */
    private String f3987id;
    private Map<String, String> properties;

    public Feature() {
        super("Feature");
        this.properties = new LinkedHashMap();
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public String getId() {
        return this.f3987id;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void setId(String str) {
        this.f3987id = str;
    }

    public void setProperties(Map<String, String> map) {
        this.properties = map;
    }
}
