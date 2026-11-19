.class public final La0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/j;


# instance fields
.field public final a:Lcom/caverock/androidsvg/SVG;

.field public final b:Lcom/caverock/androidsvg/a;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/caverock/androidsvg/SVG;Lcom/caverock/androidsvg/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La0/e;->a:Lcom/caverock/androidsvg/SVG;

    .line 5
    .line 6
    iput-object p2, p0, La0/e;->b:Lcom/caverock/androidsvg/a;

    .line 7
    .line 8
    iput p3, p0, La0/e;->c:I

    .line 9
    .line 10
    iput p4, p0, La0/e;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, La0/e;->a:Lcom/caverock/androidsvg/SVG;

    .line 2
    .line 3
    iget-object v1, p0, La0/e;->b:Lcom/caverock/androidsvg/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lcom/caverock/androidsvg/SVG;->o(Landroid/graphics/Canvas;Lcom/caverock/androidsvg/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, La0/e;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getSize()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x800

    .line 2
    .line 3
    return-wide v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, La0/e;->c:I

    .line 2
    .line 3
    return v0
.end method
