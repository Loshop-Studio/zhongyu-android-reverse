.class public Lcom/luck/picture/lib/widget/PreviewBottomNavBar;
.super Lcom/luck/picture/lib/widget/BottomNavBar;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/widget/BottomNavBar;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/luck/picture/lib/widget/BottomNavBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/luck/picture/lib/widget/BottomNavBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 14
    .line 15
    sget-object v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/luck/picture/lib/widget/BottomNavBar;->f()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lz6/a;->b()Lcom/luck/picture/lib/style/BottomNavBarStyle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->m()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, La7/o;->c(I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->m()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->g()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, La7/o;->b(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->g()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public getEditor()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 2
    .line 3
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/luck/picture/lib/widget/BottomNavBar;->onClick(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_editor:I

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->g:Lcom/luck/picture/lib/widget/BottomNavBar$b;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/BottomNavBar$b;->b()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
