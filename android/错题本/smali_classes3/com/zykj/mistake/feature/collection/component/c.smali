.class public final synthetic Lcom/zykj/mistake/feature/collection/component/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:Z

.field public final synthetic g:Lr6/a;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJFFZLr6/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/c;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/collection/component/c;->b:J

    iput-wide p4, p0, Lcom/zykj/mistake/feature/collection/component/c;->c:J

    iput p6, p0, Lcom/zykj/mistake/feature/collection/component/c;->d:F

    iput p7, p0, Lcom/zykj/mistake/feature/collection/component/c;->e:F

    iput-boolean p8, p0, Lcom/zykj/mistake/feature/collection/component/c;->f:Z

    iput-object p9, p0, Lcom/zykj/mistake/feature/collection/component/c;->g:Lr6/a;

    iput p10, p0, Lcom/zykj/mistake/feature/collection/component/c;->h:I

    iput p11, p0, Lcom/zykj/mistake/feature/collection/component/c;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/collection/component/c;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/component/c;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/zykj/mistake/feature/collection/component/c;->b:J

    .line 20
    .line 21
    iget-wide v3, p0, Lcom/zykj/mistake/feature/collection/component/c;->c:J

    .line 22
    .line 23
    iget v5, p0, Lcom/zykj/mistake/feature/collection/component/c;->d:F

    .line 24
    .line 25
    iget v6, p0, Lcom/zykj/mistake/feature/collection/component/c;->e:F

    .line 26
    .line 27
    iget-boolean v7, p0, Lcom/zykj/mistake/feature/collection/component/c;->f:Z

    .line 28
    .line 29
    iget-object v8, p0, Lcom/zykj/mistake/feature/collection/component/c;->g:Lr6/a;

    .line 30
    .line 31
    iget v11, p0, Lcom/zykj/mistake/feature/collection/component/c;->i:I

    .line 32
    .line 33
    invoke-static/range {v0 .. v11}, Lcom/zykj/mistake/feature/collection/component/f;->a(Ljava/lang/String;JJFFZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 37
    .line 38
    return-object p1
.end method
