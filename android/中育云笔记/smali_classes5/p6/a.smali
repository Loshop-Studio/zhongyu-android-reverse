.class public abstract Lp6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/appcompat/app/AppCompatActivity;IIZ)V
    .locals 6

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v2, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move v3, p1

    .line 5
    move v4, p2

    .line 6
    move v5, p3

    .line 7
    invoke-static/range {v0 .. v5}, Lp6/a;->b(Landroidx/appcompat/app/AppCompatActivity;ZZIIZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static b(Landroidx/appcompat/app/AppCompatActivity;ZZIIZ)V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    const/high16 v2, 0xc000000

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 16
    .line 17
    .line 18
    if-nez p3, :cond_0

    .line 19
    .line 20
    move v3, v4

    .line 21
    :cond_0
    invoke-static {p0, v4, v4, v3, p5}, Lp6/b;->d(Landroid/app/Activity;ZZZZ)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    if-nez p1, :cond_3

    .line 29
    .line 30
    if-nez p2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroid/view/Window;->requestFeature(I)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 36
    .line 37
    .line 38
    if-nez p3, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v4, v3

    .line 42
    :goto_0
    invoke-static {p0, v3, v3, v4, p5}, Lp6/b;->d(Landroid/app/Activity;ZZZZ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    if-nez p1, :cond_5

    .line 50
    .line 51
    invoke-virtual {v0, v4}, Landroid/view/Window;->requestFeature(I)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 55
    .line 56
    .line 57
    if-nez p3, :cond_4

    .line 58
    .line 59
    move p1, v4

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    move p1, v3

    .line 62
    :goto_1
    invoke-static {p0, v3, v4, p1, p5}, Lp6/b;->d(Landroid/app/Activity;ZZZZ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 66
    .line 67
    .line 68
    :goto_2
    invoke-virtual {v0, p3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p4}, Landroid/view/Window;->setNavigationBarColor(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    :cond_5
    return-void

    .line 75
    :catch_0
    move-exception p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static c(Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x4000000

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/16 p1, 0x2500

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/16 v1, 0x500

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    const p1, 0x1020002

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Landroid/view/ViewGroup;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->requestApplyInsets(Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method
