.class public abstract Lvb/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "BACKGROUND_COLOR_INT"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final b()Ljava/lang/Float;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ERASER_SIZE_FLOAT"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getFloat(Ljava/lang/String;)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final c()Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "PEN_COLOR"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final d()Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "PEN_SIZE_LEVEL"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final e()Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "PEN_TYPE_LEVEL"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final f()Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "TEXT_COLOR"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final g()Ljava/lang/Float;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "TEXT_SIZE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getFloat(Ljava/lang/String;)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final h()Ljava/lang/Boolean;
    .locals 2

    .line 1
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "IS_TOUCHABLE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public static final i()Lcom/blankj/utilcode/util/SPUtils;
    .locals 2

    .line 1
    const-string v0, "VIEW"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/SPUtils;->getInstance(Ljava/lang/String;)Lcom/blankj/utilcode/util/SPUtils;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getInstance(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final j(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "BACKGROUND_COLOR_INT"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final k(Ljava/lang/Float;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "ERASER_SIZE_FLOAT"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;F)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final l(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "PEN_COLOR"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final m(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "PEN_SIZE_LEVEL"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final n(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "PEN_TYPE_LEVEL"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final o(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "TEXT_COLOR"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final p(Ljava/lang/Float;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "TEXT_SIZE"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;F)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final q(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {}, Lvb/n;->i()Lcom/blankj/utilcode/util/SPUtils;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "IS_TOUCHABLE"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
