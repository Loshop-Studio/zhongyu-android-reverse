.class public Lz/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/f$c;,
        Lz/f$a;,
        Lz/f$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lz/d;IZILandroid/os/Handler;Lz/f$c;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    new-instance v0, Lz/a;

    invoke-direct {v0, p6, p5}, Lz/a;-><init>(Lz/f$c;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    .line 2
    invoke-static {p0, p1, v0, p2, p4}, Lz/e;->e(Landroid/content/Context;Lz/d;Lz/a;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p3, 0x0

    .line 3
    invoke-static {p0, p1, p2, p3, v0}, Lz/e;->d(Landroid/content/Context;Lz/d;ILjava/util/concurrent/Executor;Lz/a;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
