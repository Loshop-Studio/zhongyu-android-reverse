.class public final synthetic Lcom/zykj/mistake/feature/notebook/list/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/a;

.field public final synthetic h:Lr6/a;

.field public final synthetic i:Lr6/a;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Set;ZZLcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;Lr6/c;Lr6/a;Lr6/a;Lr6/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/g;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/g;->b:Ljava/util/Set;

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/notebook/list/g;->c:Z

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/list/g;->d:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/list/g;->e:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/list/g;->f:Lr6/c;

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/list/g;->g:Lr6/a;

    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/list/g;->h:Lr6/a;

    iput-object p9, p0, Lcom/zykj/mistake/feature/notebook/list/g;->i:Lr6/a;

    iput p10, p0, Lcom/zykj/mistake/feature/notebook/list/g;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/list/g;->j:I

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/g;->a:Ljava/util/List;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/g;->b:Ljava/util/Set;

    .line 20
    .line 21
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/g;->c:Z

    .line 22
    .line 23
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/list/g;->d:Z

    .line 24
    .line 25
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/g;->e:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/list/g;->f:Lr6/c;

    .line 28
    .line 29
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/list/g;->g:Lr6/a;

    .line 30
    .line 31
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/list/g;->h:Lr6/a;

    .line 32
    .line 33
    iget-object v8, p0, Lcom/zykj/mistake/feature/notebook/list/g;->i:Lr6/a;

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, Lcom/zykj/mistake/feature/notebook/list/j;->d(Ljava/util/List;Ljava/util/Set;ZZLcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;Lr6/c;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 39
    .line 40
    return-object p1
.end method
