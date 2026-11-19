.class public Lorg/angmarch/views/b;
.super Lorg/angmarch/views/c;
.source "SourceFile"


# instance fields
.field public final f:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListAdapter;IILn9/d;Lorg/angmarch/views/PopUpTextAlignment;)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move v2, p3

    .line 4
    move v3, p4

    .line 5
    move-object v4, p5

    .line 6
    move-object v5, p6

    .line 7
    invoke-direct/range {v0 .. v5}, Lorg/angmarch/views/c;-><init>(Landroid/content/Context;IILn9/d;Lorg/angmarch/views/PopUpTextAlignment;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lorg/angmarch/views/b;->f:Landroid/widget/ListAdapter;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/b;->f:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/b;->f:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/b;->f:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    iget v1, p0, Lorg/angmarch/views/c;->e:I

    .line 4
    .line 5
    if-lt p1, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    :cond_0
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
