.class public final Lv0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/e;


# instance fields
.field public final a:Ll0/d;


# direct methods
.method public constructor <init>(Ll0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/f;->a:Ll0/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Lg0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv0/f;->d(Lg0/a;Lh0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh0/d;)Lk0/j;
    .locals 0

    .line 1
    check-cast p1, Lg0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lv0/f;->c(Lg0/a;IILh0/d;)Lk0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lg0/a;IILh0/d;)Lk0/j;
    .locals 0

    .line 1
    invoke-interface {p1}, Lg0/a;->a()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lv0/f;->a:Ll0/d;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lr0/e;->c(Landroid/graphics/Bitmap;Ll0/d;)Lr0/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Lg0/a;Lh0/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
