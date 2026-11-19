.class public Lz6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/luck/picture/lib/style/AlbumWindowStyle;

.field public b:Lcom/luck/picture/lib/style/TitleBarStyle;

.field public c:Lcom/luck/picture/lib/style/SelectMainStyle;

.field public d:Lcom/luck/picture/lib/style/BottomNavBarStyle;

.field public e:Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lcom/luck/picture/lib/style/AlbumWindowStyle;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/a;->a:Lcom/luck/picture/lib/style/AlbumWindowStyle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/luck/picture/lib/style/AlbumWindowStyle;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/luck/picture/lib/style/AlbumWindowStyle;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public b()Lcom/luck/picture/lib/style/BottomNavBarStyle;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/a;->d:Lcom/luck/picture/lib/style/BottomNavBarStyle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/luck/picture/lib/style/BottomNavBarStyle;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public c()Lcom/luck/picture/lib/style/SelectMainStyle;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/a;->c:Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public d()Lcom/luck/picture/lib/style/TitleBarStyle;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/a;->b:Lcom/luck/picture/lib/style/TitleBarStyle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/luck/picture/lib/style/TitleBarStyle;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public e()Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/a;->e:Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->a()Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lz6/a;->e:Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lz6/a;->e:Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 12
    .line 13
    return-object v0
.end method
