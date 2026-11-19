.class public final synthetic Landroidx/navigation/compose/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/compose/ui/Modifier;

.field public final synthetic d:Landroidx/compose/ui/Alignment;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/c;

.field public final synthetic i:Lr6/c;

.field public final synthetic j:Lr6/c;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/k;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/k;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/navigation/compose/k;->c:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/k;->d:Landroidx/compose/ui/Alignment;

    iput-object p5, p0, Landroidx/navigation/compose/k;->e:Ljava/lang/String;

    iput-object p6, p0, Landroidx/navigation/compose/k;->f:Lr6/c;

    iput-object p7, p0, Landroidx/navigation/compose/k;->g:Lr6/c;

    iput-object p8, p0, Landroidx/navigation/compose/k;->h:Lr6/c;

    iput-object p9, p0, Landroidx/navigation/compose/k;->i:Lr6/c;

    iput-object p10, p0, Landroidx/navigation/compose/k;->j:Lr6/c;

    iput p11, p0, Landroidx/navigation/compose/k;->k:I

    iput p12, p0, Landroidx/navigation/compose/k;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Landroidx/navigation/compose/k;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/k;->b:Ljava/lang/String;

    iget-object v2, p0, Landroidx/navigation/compose/k;->c:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Landroidx/navigation/compose/k;->d:Landroidx/compose/ui/Alignment;

    iget-object v4, p0, Landroidx/navigation/compose/k;->e:Ljava/lang/String;

    iget-object v5, p0, Landroidx/navigation/compose/k;->f:Lr6/c;

    iget-object v6, p0, Landroidx/navigation/compose/k;->g:Lr6/c;

    iget-object v7, p0, Landroidx/navigation/compose/k;->h:Lr6/c;

    iget-object v8, p0, Landroidx/navigation/compose/k;->i:Lr6/c;

    iget-object v9, p0, Landroidx/navigation/compose/k;->j:Lr6/c;

    iget v10, p0, Landroidx/navigation/compose/k;->k:I

    iget v11, p0, Landroidx/navigation/compose/k;->l:I

    invoke-static/range {v0 .. v13}, Landroidx/navigation/compose/NavHostKt;->u(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1
.end method
