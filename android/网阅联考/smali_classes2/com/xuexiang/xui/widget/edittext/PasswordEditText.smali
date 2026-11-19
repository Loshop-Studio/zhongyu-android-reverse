.class public Lcom/xuexiang/xui/widget/edittext/PasswordEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Landroid/graphics/drawable/Drawable;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Landroid/text/method/PasswordTransformationMethod;


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->i:Landroid/text/method/PasswordTransformationMethod;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/widget/EditText;->setSelection(II)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final b()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    return v1
.end method

.method public final c(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->a:I

    .line 18
    .line 19
    sub-int/2addr v3, v4

    .line 20
    int-to-float v3, v3

    .line 21
    cmpl-float v0, v0, v3

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->b:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v0, v3

    .line 40
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->a:I

    .line 41
    .line 42
    add-int/2addr v0, v3

    .line 43
    int-to-float v0, v0

    .line 44
    cmpg-float p1, p1, v0

    .line 45
    .line 46
    if-gez p1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v1, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    sub-int/2addr v3, v4

    .line 64
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->b:Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    sub-int/2addr v3, v4

    .line 71
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->a:I

    .line 72
    .line 73
    sub-int/2addr v3, v4

    .line 74
    int-to-float v3, v3

    .line 75
    cmpl-float v0, v0, v3

    .line 76
    .line 77
    if-lez v0, :cond_0

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    sub-int/2addr v0, v3

    .line 92
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->a:I

    .line 93
    .line 94
    add-int/2addr v0, v3

    .line 95
    int-to-float v0, v0

    .line 96
    cmpg-float p1, p1, v0

    .line 97
    .line 98
    if-gez p1, :cond_0

    .line 99
    .line 100
    :goto_0
    return v1
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->b:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->c:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    :goto_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->e:Z

    .line 15
    .line 16
    invoke-virtual {p0, v0, v0, p1, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->e:Z

    .line 25
    .line 26
    :goto_1
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, v0}, Landroid/widget/EditText;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;->d()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->e:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;->b()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->a()V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->e:Z

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d(Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/widget/EditText;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;

    .line 6
    .line 7
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->e:Z

    .line 8
    .line 9
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;-><init>(Landroid/os/Parcelable;ZZLt0/b;)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->c(Landroid/view/MotionEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x3

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    if-eq v1, v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->h:Z

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->togglePasswordIconVisibility()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->setAction(I)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->h:Z

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->g:Z

    .line 42
    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->togglePasswordIconVisibility()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->setAction(I)V

    .line 51
    .line 52
    .line 53
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->h:Z

    .line 54
    .line 55
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->f:Z

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->f:Z

    return-void
.end method

.method public final togglePasswordIconVisibility()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->a()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->d(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
