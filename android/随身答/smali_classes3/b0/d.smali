.class public abstract Lb0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lokio/BufferedSource;)Lb0/b;
    .locals 1

    .line 1
    new-instance v0, Lb0/a;

    .line 2
    .line 3
    invoke-interface {p0}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/caverock/androidsvg/SVG;->l(Ljava/io/InputStream;)Lcom/caverock/androidsvg/SVG;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lb0/a;-><init>(Lcom/caverock/androidsvg/SVG;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
