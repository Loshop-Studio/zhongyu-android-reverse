.class public Lv/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lj/d;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv/e;->d(Landroid/graphics/drawable/Drawable;Lj/d;)Z

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
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lv/e;->c(Landroid/graphics/drawable/Drawable;IILj/d;)Lm/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/graphics/drawable/Drawable;IILj/d;)Lm/j;
    .locals 0

    .line 1
    invoke-static {p1}, Lv/c;->d(Landroid/graphics/drawable/Drawable;)Lm/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public d(Landroid/graphics/drawable/Drawable;Lj/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method
