package p125n7;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* renamed from: n7.g */
/* loaded from: classes4.dex */
public final class C6232g {

    /* renamed from: a */
    public final boolean f9975a;

    /* renamed from: b */
    public final boolean f9976b;

    /* renamed from: c */
    public final boolean f9977c;

    /* renamed from: d */
    public final String f9978d;

    /* renamed from: e */
    public final String f9979e;

    /* renamed from: f */
    public final boolean f9980f;

    /* renamed from: g */
    public final ClassDiscriminatorMode f9981g;

    public C6232g(boolean z8, boolean z9, boolean z10, String prettyPrintIndent, String classDiscriminator, boolean z11, ClassDiscriminatorMode classDiscriminatorMode) {
        AbstractC5830k.m5330g(prettyPrintIndent, "prettyPrintIndent");
        AbstractC5830k.m5330g(classDiscriminator, "classDiscriminator");
        AbstractC5830k.m5330g(classDiscriminatorMode, "classDiscriminatorMode");
        this.f9975a = z8;
        this.f9976b = z9;
        this.f9977c = z10;
        this.f9978d = prettyPrintIndent;
        this.f9979e = classDiscriminator;
        this.f9980f = z11;
        this.f9981g = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f9975a + ", ignoreUnknownKeys=" + this.f9976b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f9977c + ", prettyPrintIndent='" + this.f9978d + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f9979e + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f9980f + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f9981g + ')';
    }
}
