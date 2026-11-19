.class public abstract Lcom/blankj/utilcode/util/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/blankj/utilcode/util/f$c;
    }
.end annotation


# direct methods
.method public static a([Landroid/view/View;ZJLandroid/view/View$OnClickListener;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    if-nez p4, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    array-length v0, p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    aget-object v2, p0, v1

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    new-instance v3, Lcom/blankj/utilcode/util/f$a;

    .line 19
    .line 20
    invoke-direct {v3, p1, p2, p3, p4}, Lcom/blankj/utilcode/util/f$a;-><init>(ZJLandroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    .line 26
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_2
    return-void
.end method

.method public static b(Landroid/view/View;JLandroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    filled-new-array {p0}, [Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p1, p2, p3}, Lcom/blankj/utilcode/util/f;->c([Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static c([Landroid/view/View;JLandroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1, p2, p3}, Lcom/blankj/utilcode/util/f;->a([Landroid/view/View;ZJLandroid/view/View$OnClickListener;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static d(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p1, p1, p1}, Lcom/blankj/utilcode/util/f;->e(Landroid/view/View;IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static e(Landroid/view/View;IIII)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v7, v0

    .line 6
    check-cast v7, Landroid/view/View;

    .line 7
    .line 8
    if-nez v7, :cond_0

    .line 9
    .line 10
    const-string p0, "ClickUtils"

    .line 11
    .line 12
    const-string p1, "expandClickArea must have parent view."

    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v1, Lcom/blankj/utilcode/util/f$b;

    .line 19
    .line 20
    move-object v2, p0

    .line 21
    move v3, p1

    .line 22
    move v5, p2

    .line 23
    move v6, p3

    .line 24
    move v4, p4

    .line 25
    invoke-direct/range {v1 .. v7}, Lcom/blankj/utilcode/util/f$b;-><init>(Landroid/view/View;IIIILandroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v7, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method
