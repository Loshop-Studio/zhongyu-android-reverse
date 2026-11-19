.class public final Lv0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/z$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv0/z;->d(Landroid/graphics/Bitmap;Lm0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILm0/d;)Lo0/j;
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lv0/z;->c(Landroid/graphics/Bitmap;IILm0/d;)Lo0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/graphics/Bitmap;IILm0/d;)Lo0/j;
    .locals 0

    .line 1
    new-instance p2, Lv0/z$a;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lv0/z$a;-><init>(Landroid/graphics/Bitmap;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method

.method public d(Landroid/graphics/Bitmap;Lm0/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
