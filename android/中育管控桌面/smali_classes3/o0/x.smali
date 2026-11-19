.class public Lo0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/e;


# instance fields
.field public final a:Lq0/k;

.field public final b:Li0/d;


# direct methods
.method public constructor <init>(Lq0/k;Li0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0/x;->a:Lq0/k;

    .line 5
    .line 6
    iput-object p2, p0, Lo0/x;->b:Li0/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILf0/d;)Lh0/j;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lo0/x;->c(Landroid/net/Uri;IILf0/d;)Lh0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lf0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lo0/x;->d(Landroid/net/Uri;Lf0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Landroid/net/Uri;IILf0/d;)Lh0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/x;->a:Lq0/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lq0/k;->c(Landroid/net/Uri;IILf0/d;)Lh0/j;

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
    invoke-interface {p1}, Lh0/j;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iget-object p4, p0, Lo0/x;->b:Li0/d;

    .line 18
    .line 19
    invoke-static {p4, p1, p2, p3}, Lo0/p;->a(Li0/d;Landroid/graphics/drawable/Drawable;II)Lh0/j;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public d(Landroid/net/Uri;Lf0/d;)Z
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
