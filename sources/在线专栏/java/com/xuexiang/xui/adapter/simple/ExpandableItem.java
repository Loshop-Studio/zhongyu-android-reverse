package com.xuexiang.xui.adapter.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class ExpandableItem {
    private List<AdapterItem> mChild;
    private AdapterItem mGroup;

    public ExpandableItem(AdapterItem adapterItem) {
        this.mGroup = adapterItem;
        this.mChild = new ArrayList();
    }

    /* renamed from: of */
    public static ExpandableItem m7960of(AdapterItem adapterItem) {
        return new ExpandableItem(adapterItem);
    }

    public ExpandableItem addChild(AdapterItem adapterItem) {
        if (this.mChild == null) {
            this.mChild = new ArrayList();
        }
        this.mChild.add(adapterItem);
        return this;
    }

    public List<AdapterItem> getChild() {
        return this.mChild;
    }

    public AdapterItem getChildItem(int i4) {
        List<AdapterItem> list = this.mChild;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    public int getChildSize() {
        List<AdapterItem> list = this.mChild;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public AdapterItem getGroup() {
        return this.mGroup;
    }

    public ExpandableItem setChild(List<AdapterItem> list) {
        this.mChild = list;
        return this;
    }

    public ExpandableItem setGroup(AdapterItem adapterItem) {
        this.mGroup = adapterItem;
        return this;
    }

    public ExpandableItem(AdapterItem adapterItem, AdapterItem... adapterItemArr) {
        this.mGroup = adapterItem;
        this.mChild = new ArrayList(Arrays.asList(adapterItemArr));
    }

    public ExpandableItem addChild(int i4, AdapterItem adapterItem) {
        if (this.mChild == null) {
            this.mChild = new ArrayList();
        }
        this.mChild.add(i4, adapterItem);
        return this;
    }

    public ExpandableItem(AdapterItem adapterItem, List<AdapterItem> list) {
        this.mGroup = adapterItem;
        this.mChild = list;
    }

    public ExpandableItem addChild(AdapterItem... adapterItemArr) {
        if (this.mChild == null) {
            this.mChild = new ArrayList();
        }
        this.mChild.addAll(Arrays.asList(adapterItemArr));
        return this;
    }
}
