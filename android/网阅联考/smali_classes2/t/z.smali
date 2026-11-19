.class public Lt/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/e;


# instance fields
.field public final a:Lv/d;

.field public final b:Ln/d;


# direct methods
.method public constructor <init>(Lv/d;Ln/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt/z;->a:Lv/d;

    .line 5
    .line 6
    iput-object p2, p0, Lt/z;->b:Ln/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lj/d;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt/z;->d(Landroid/net/Uri;Lj/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILj/d;)Lm/j;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lt/z;->c(Landroid/net/Uri;IILj/d;)Lm/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/net/Uri;IILj/d;)Lm/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lt/z;->a:Lv/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lv/d;->c(Landroid/net/Uri;IILj/d;)Lm/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    invoke-interface {p1}, Lm/j;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iget-object p4, p0, Lt/z;->b:Ln/d;

    .line 18
    .line 19
    invoke-static {p4, p1, p2, p3}, Lt/r;->a(Ln/d;Landroid/graphics/drawable/Drawable;II)Lm/j;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public d(Landroid/net/Uri;Lj/d;)Z
    .locals 0

    .line 1
    const-string p2, "android.resource"

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
