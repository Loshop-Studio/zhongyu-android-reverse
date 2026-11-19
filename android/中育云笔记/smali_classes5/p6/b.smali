.class public abstract Lp6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;ZZ)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 p1, 0x100

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/16 v0, 0x500

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    if-nez p1, :cond_2

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method public static b(Landroid/app/Activity;ZZZZ)V
    .locals 1

    .line 1
    if-eqz p3, :cond_5

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/16 p1, 0x2100

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/16 p1, 0x100

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/16 p3, 0x500

    .line 34
    .line 35
    const/16 v0, 0x2500

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    if-nez p2, :cond_3

    .line 40
    .line 41
    if-eqz p4, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0, p3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    if-nez p1, :cond_7

    .line 60
    .line 61
    if-eqz p2, :cond_7

    .line 62
    .line 63
    if-eqz p4, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, p3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p4, :cond_6

    .line 90
    .line 91
    const/16 p1, 0x2000

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    const/4 p1, 0x0

    .line 98
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    .line 101
    :catch_0
    :cond_7
    return-void
.end method

.method public static c(Landroid/app/Activity;ZZZZ)Z
    .locals 6

    .line 1
    const-class v0, Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p0, :cond_2

    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lp6/b;->a(Landroid/app/Activity;ZZ)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "MEIZU_FLAG_DARK_STATUS_BAR_ICON"

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "meizuFlags"

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz p4, :cond_0

    .line 46
    .line 47
    or-int/2addr v3, v5

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    not-int v3, v3

    .line 50
    and-int/2addr v3, v5

    .line 51
    :goto_0
    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 59
    .line 60
    .line 61
    :try_start_1
    invoke-static {}, Lp6/c;->b()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x7

    .line 66
    if-lt v0, v1, :cond_1

    .line 67
    .line 68
    invoke-static {p0, p1, p2, p3, p4}, Lp6/b;->b(Landroid/app/Activity;ZZZZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    .line 70
    .line 71
    return v4

    .line 72
    :catch_0
    move v1, v4

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    return v4

    .line 75
    :catch_1
    :goto_1
    invoke-static {p0, p1, p2, p3, p4}, Lp6/b;->b(Landroid/app/Activity;ZZZZ)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return v1
.end method

.method public static d(Landroid/app/Activity;ZZZZ)V
    .locals 2

    .line 1
    invoke-static {}, Lp6/c;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lp6/b;->b(Landroid/app/Activity;ZZZZ)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lp6/b;->c(Landroid/app/Activity;ZZZZ)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-static {}, Lp6/c;->d()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x7

    .line 28
    if-lt v0, v1, :cond_3

    .line 29
    .line 30
    invoke-static {p0, p1, p2, p3, p4}, Lp6/b;->b(Landroid/app/Activity;ZZZZ)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Lp6/b;->e(Landroid/app/Activity;ZZZZ)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static e(Landroid/app/Activity;ZZZZ)Z
    .locals 5

    .line 1
    invoke-static {p0, p1, p2}, Lp6/b;->a(Landroid/app/Activity;ZZ)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    const-string v2, "android.view.MiuiWindowManager$LayoutParams"

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "EXTRA_FLAG_STATUS_BAR_DARK_MODE"

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "setExtraFlags"

    .line 30
    .line 31
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    filled-new-array {v4, v4}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz p4, :cond_0

    .line 46
    .line 47
    move v4, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v4, v1

    .line 50
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :catch_0
    invoke-static {p0, p1, p2, p3, p4}, Lp6/b;->b(Landroid/app/Activity;ZZZZ)V

    .line 68
    .line 69
    .line 70
    return v1
.end method
