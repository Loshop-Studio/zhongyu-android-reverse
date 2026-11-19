.class public Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/CharSequence;

.field public c:Landroid/widget/TextView$BufferType;

.field public d:Z

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Ljava/lang/CharSequence;

.field public h:I

.field public i:Z

.field public j:I

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method private getDisplayableText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final b(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    sub-int/2addr v0, p2

    .line 10
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/16 v1, 0x21

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v2, v0, p2, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public final c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->k:I

    .line 13
    .line 14
    if-le v0, v1, :cond_1

    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->d:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->e()Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->f()Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->j:I

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->m:I

    .line 37
    .line 38
    if-lez v0, :cond_3

    .line 39
    .line 40
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->d:Z

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->l:I

    .line 53
    .line 54
    if-le v0, v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->e()Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->f()Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_3
    return-object p1
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->getDisplayableText()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->c:Landroid/widget/TextView$BufferType;

    .line 6
    .line 7
    invoke-super {p0, v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final e()Ljava/lang/CharSequence;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->j:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->k:I

    .line 16
    .line 17
    :goto_0
    add-int/2addr v0, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->m:I

    .line 20
    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->g:Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->e:Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    add-int/2addr v1, v3

    .line 34
    add-int/2addr v1, v2

    .line 35
    sub-int/2addr v0, v1

    .line 36
    if-gez v0, :cond_2

    .line 37
    .line 38
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->k:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 42
    .line 43
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b:Ljava/lang/CharSequence;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v1, v2, v3, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;II)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->g:Ljava/lang/CharSequence;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->e:Ljava/lang/CharSequence;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->e:Ljava/lang/CharSequence;

    .line 62
    .line 63
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b:Ljava/lang/CharSequence;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-direct {v0, v1, v2, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;II)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->f:Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->f:Ljava/lang/CharSequence;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b:Ljava/lang/CharSequence;

    .line 31
    .line 32
    return-object v0
.end method

.method public setColorClickableText(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->b:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->c:Landroid/widget/TextView$BufferType;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->d()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTrimCollapsedText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->e:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method public setTrimExpandedText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->f:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method public setTrimLength(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->k:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTrimLines(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public setTrimMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ReadMoreTextView;->j:I

    .line 2
    .line 3
    return-void
.end method
