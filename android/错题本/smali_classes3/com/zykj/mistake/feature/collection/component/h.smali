.class public final synthetic Lcom/zykj/mistake/feature/collection/component/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/util/Set;

.field public final synthetic h:Ljava/util/Set;

.field public final synthetic i:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic j:Lr6/a;

.field public final synthetic k:Lr6/a;

.field public final synthetic l:Lr6/c;

.field public final synthetic m:Lr6/c;

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZZZLandroidx/compose/ui/Modifier;ZLjava/util/Set;Ljava/util/Set;Landroidx/compose/foundation/layout/PaddingValues;Lr6/a;Lr6/a;Lr6/c;Lr6/c;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/h;->a:Ljava/util/List;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/component/h;->b:Z

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/component/h;->c:Z

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/collection/component/h;->d:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/collection/component/h;->e:Landroidx/compose/ui/Modifier;

    iput-boolean p6, p0, Lcom/zykj/mistake/feature/collection/component/h;->f:Z

    iput-object p7, p0, Lcom/zykj/mistake/feature/collection/component/h;->g:Ljava/util/Set;

    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/component/h;->h:Ljava/util/Set;

    iput-object p9, p0, Lcom/zykj/mistake/feature/collection/component/h;->i:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p10, p0, Lcom/zykj/mistake/feature/collection/component/h;->j:Lr6/a;

    iput-object p11, p0, Lcom/zykj/mistake/feature/collection/component/h;->k:Lr6/a;

    iput-object p12, p0, Lcom/zykj/mistake/feature/collection/component/h;->l:Lr6/c;

    iput-object p13, p0, Lcom/zykj/mistake/feature/collection/component/h;->m:Lr6/c;

    iput p14, p0, Lcom/zykj/mistake/feature/collection/component/h;->n:I

    iput p15, p0, Lcom/zykj/mistake/feature/collection/component/h;->o:I

    move/from16 p1, p16

    iput p1, p0, Lcom/zykj/mistake/feature/collection/component/h;->p:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, Landroidx/compose/runtime/Composer;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lcom/zykj/mistake/feature/collection/component/h;->n:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 19
    .line 20
    .line 21
    move-result v15

    .line 22
    iget v1, v0, Lcom/zykj/mistake/feature/collection/component/h;->o:I

    .line 23
    .line 24
    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 25
    .line 26
    .line 27
    move-result v16

    .line 28
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/component/h;->a:Ljava/util/List;

    .line 29
    .line 30
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/collection/component/h;->b:Z

    .line 31
    .line 32
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/collection/component/h;->c:Z

    .line 33
    .line 34
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/collection/component/h;->d:Z

    .line 35
    .line 36
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/component/h;->e:Landroidx/compose/ui/Modifier;

    .line 37
    .line 38
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/collection/component/h;->f:Z

    .line 39
    .line 40
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/component/h;->g:Ljava/util/Set;

    .line 41
    .line 42
    iget-object v8, v0, Lcom/zykj/mistake/feature/collection/component/h;->h:Ljava/util/Set;

    .line 43
    .line 44
    iget-object v9, v0, Lcom/zykj/mistake/feature/collection/component/h;->i:Landroidx/compose/foundation/layout/PaddingValues;

    .line 45
    .line 46
    iget-object v10, v0, Lcom/zykj/mistake/feature/collection/component/h;->j:Lr6/a;

    .line 47
    .line 48
    iget-object v11, v0, Lcom/zykj/mistake/feature/collection/component/h;->k:Lr6/a;

    .line 49
    .line 50
    iget-object v12, v0, Lcom/zykj/mistake/feature/collection/component/h;->l:Lr6/c;

    .line 51
    .line 52
    iget-object v13, v0, Lcom/zykj/mistake/feature/collection/component/h;->m:Lr6/c;

    .line 53
    .line 54
    move-object/from16 v17, v1

    .line 55
    .line 56
    iget v1, v0, Lcom/zykj/mistake/feature/collection/component/h;->p:I

    .line 57
    .line 58
    move-object/from16 v18, v17

    .line 59
    .line 60
    move/from16 v17, v1

    .line 61
    .line 62
    move-object/from16 v1, v18

    .line 63
    .line 64
    invoke-static/range {v1 .. v17}, Lcom/zykj/mistake/feature/collection/component/o;->b(Ljava/util/List;ZZZLandroidx/compose/ui/Modifier;ZLjava/util/Set;Ljava/util/Set;Landroidx/compose/foundation/layout/PaddingValues;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 65
    .line 66
    .line 67
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 68
    .line 69
    return-object v1
.end method
