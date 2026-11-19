.class public abstract synthetic Lcom/blankj/utilcode/util/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/app/Application;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Application;->getDataDir()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method
