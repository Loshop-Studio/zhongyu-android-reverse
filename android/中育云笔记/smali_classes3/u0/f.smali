.class public final Lu0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/f;


# instance fields
.field public final a:Lk0/d;


# direct methods
.method public constructor <init>(Lk0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/f;->a:Lk0/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh0/e;)Z
    .locals 0

    .line 1
    check-cast p1, Lg0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu0/f;->d(Lg0/a;Lh0/e;)Z

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
    check-cast p1, Lg0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lu0/f;->c(Lg0/a;IILh0/e;)Lj0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lg0/a;IILh0/e;)Lj0/j;
    .locals 0

    .line 1
    invoke-interface {p1}, Lg0/a;->a()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lu0/f;->a:Lk0/d;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lq0/f;->c(Landroid/graphics/Bitmap;Lk0/d;)Lq0/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Lg0/a;Lh0/e;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
