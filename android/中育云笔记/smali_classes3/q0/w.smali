.class public Lq0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/f;


# instance fields
.field public final a:Ls0/k;

.field public final b:Lk0/d;


# direct methods
.method public constructor <init>(Ls0/k;Lk0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/w;->a:Ls0/k;

    .line 5
    .line 6
    iput-object p2, p0, Lq0/w;->b:Lk0/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh0/e;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lq0/w;->d(Landroid/net/Uri;Lh0/e;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh0/e;)Lj0/j;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lq0/w;->c(Landroid/net/Uri;IILh0/e;)Lj0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/net/Uri;IILh0/e;)Lj0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/w;->a:Ls0/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ls0/k;->c(Landroid/net/Uri;IILh0/e;)Lj0/j;

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
    invoke-interface {p1}, Lj0/j;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iget-object p4, p0, Lq0/w;->b:Lk0/d;

    .line 18
    .line 19
    invoke-static {p4, p1, p2, p3}, Lq0/o;->a(Lk0/d;Landroid/graphics/drawable/Drawable;II)Lj0/j;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public d(Landroid/net/Uri;Lh0/e;)Z
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
