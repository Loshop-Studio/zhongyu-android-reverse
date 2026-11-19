.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Ljava/lang/CharSequence;

.field public k:Ljava/util/List;

.field public l:I

.field public m:I

.field public n:I

.field public o:Z


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->a:I

    .line 7
    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->b:I

    .line 9
    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->c:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->d:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->e:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->f:I

    .line 19
    .line 20
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->g:I

    .line 21
    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->h:I

    .line 23
    .line 24
    const/16 v0, 0x11

    .line 25
    .line 26
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->i:I

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->l:I

    .line 30
    .line 31
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->m:I

    .line 32
    .line 33
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->n:I

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->o:Z

    .line 37
    .line 38
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->j:Ljava/lang/CharSequence;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->f:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public i()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->d:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public k()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->e:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->j:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public o(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public p(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->f:I

    .line 2
    .line 3
    return-void
.end method
