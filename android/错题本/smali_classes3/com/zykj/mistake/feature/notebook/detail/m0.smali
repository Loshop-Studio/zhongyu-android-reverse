.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:F

.field public final synthetic g:Lr6/a;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(ZJIILjava/lang/String;FLr6/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->a:Z

    iput-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->b:J

    iput p4, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->c:I

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->d:I

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->e:Ljava/lang/String;

    iput p7, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->f:F

    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->g:Lr6/a;

    iput p9, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->h:I

    iput p10, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->a:Z

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->b:J

    .line 20
    .line 21
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->c:I

    .line 22
    .line 23
    iget v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->d:I

    .line 24
    .line 25
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->e:Ljava/lang/String;

    .line 26
    .line 27
    iget v6, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->f:F

    .line 28
    .line 29
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->g:Lr6/a;

    .line 30
    .line 31
    iget v10, p0, Lcom/zykj/mistake/feature/notebook/detail/m0;->i:I

    .line 32
    .line 33
    invoke-static/range {v0 .. v10}, Lcom/zykj/mistake/feature/notebook/detail/n0;->a(ZJIILjava/lang/String;FLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 37
    .line 38
    return-object p1
.end method
