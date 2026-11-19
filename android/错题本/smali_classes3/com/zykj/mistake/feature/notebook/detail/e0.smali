.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/a5;

.field public final synthetic c:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public final synthetic d:Z

.field public final synthetic e:Lr6/a;

.field public final synthetic f:Lr6/a;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/a;

.field public final synthetic i:Lr6/a;

.field public final synthetic j:Lr6/a;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->a:Z

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->b:Lcom/zykj/mistake/feature/notebook/detail/a5;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->c:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->d:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->e:Lr6/a;

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->f:Lr6/a;

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->g:Lr6/c;

    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->h:Lr6/a;

    iput-object p9, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->i:Lr6/a;

    iput-object p10, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->j:Lr6/a;

    iput p11, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->k:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->a:Z

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->b:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->c:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 22
    .line 23
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->d:Z

    .line 24
    .line 25
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->e:Lr6/a;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->f:Lr6/a;

    .line 28
    .line 29
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->g:Lr6/c;

    .line 30
    .line 31
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->h:Lr6/a;

    .line 32
    .line 33
    iget-object v8, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->i:Lr6/a;

    .line 34
    .line 35
    iget-object v9, p0, Lcom/zykj/mistake/feature/notebook/detail/e0;->j:Lr6/a;

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/g0;->c(ZLcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 41
    .line 42
    return-object p1
.end method
