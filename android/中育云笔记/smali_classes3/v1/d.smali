.class public abstract Lv1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lv1/c;
    .locals 1

    .line 1
    new-instance v0, Lv1/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lv1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lv1/c;
    .locals 1

    .line 1
    new-instance v0, Lv1/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lv1/a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
