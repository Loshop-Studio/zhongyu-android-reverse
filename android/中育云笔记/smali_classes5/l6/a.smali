.class public abstract Ll6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Intent;)Ljava/lang/Throwable;
    .locals 1

    .line 1
    const-string v0, "com.yalantis.ucrop.Error"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Throwable;

    .line 8
    .line 9
    return-object p0
.end method

.method public static b(Landroid/content/Intent;)Landroid/net/Uri;
    .locals 1

    .line 1
    const-string v0, "output"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/net/Uri;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "com.yalantis.ucrop.OutputUri"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/net/Uri;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    return-object v0
.end method

.method public static c(Landroid/content/Intent;)F
    .locals 2

    .line 1
    const-string v0, "com.yalantis.ucrop.CropAspectRatio"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static d(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "customExtraData"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static e(Landroid/content/Intent;)I
    .locals 2

    .line 1
    const-string v0, "com.yalantis.ucrop.ImageHeight"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static f(Landroid/content/Intent;)I
    .locals 2

    .line 1
    const-string v0, "com.yalantis.ucrop.OffsetX"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static g(Landroid/content/Intent;)I
    .locals 2

    .line 1
    const-string v0, "com.yalantis.ucrop.OffsetY"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static h(Landroid/content/Intent;)I
    .locals 2

    .line 1
    const-string v0, "com.yalantis.ucrop.ImageWidth"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method
