package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class NoteResource {
    public static final int $stable = 0;
    private final String local; // The res.json writer stores the absolute Android filename here.
    private final String service; // Paired resource location read by the legacy downloader.

    public NoteResource(String local, String service) {
        AbstractC9979u.m20294g(local, "local");
        AbstractC9979u.m20294g(service, "service");
        this.local = local;
        this.service = service;
    }

    public static /* synthetic */ NoteResource copy$default(NoteResource noteResource, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = noteResource.local;
        }
        if ((i10 & 2) != 0) {
            str2 = noteResource.service;
        }
        return noteResource.copy(str, str2);
    }

    public final String component1() {
        return this.local;
    }

    public final String component2() {
        return this.service;
    }

    public final NoteResource copy(String local, String service) {
        AbstractC9979u.m20294g(local, "local");
        AbstractC9979u.m20294g(service, "service");
        return new NoteResource(local, service);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteResource)) {
            return false;
        }
        NoteResource noteResource = (NoteResource) obj;
        return AbstractC9979u.m20289b(this.local, noteResource.local) && AbstractC9979u.m20289b(this.service, noteResource.service);
    }

    public final String getLocal() {
        return this.local;
    }

    public final String getService() {
        return this.service;
    }

    public int hashCode() {
        return (this.local.hashCode() * 31) + this.service.hashCode();
    }

    public String toString() {
        return "NoteResource(local=" + this.local + ", service=" + this.service + ")";
    }
}
