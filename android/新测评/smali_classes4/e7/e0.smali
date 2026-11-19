.class public final synthetic Le7/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Z

.field public final synthetic i:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic j:Landroidx/compose/foundation/text/KeyboardOptions;

.field public final synthetic k:Z

.field public final synthetic l:Lkotlin/jvm/functions/Function0;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Landroidx/compose/ui/text/TextStyle;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/e0;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Le7/e0;->b:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Le7/e0;->c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p4, p0, Le7/e0;->d:Ljava/lang/String;

    iput-object p5, p0, Le7/e0;->e:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Le7/e0;->f:I

    iput-object p7, p0, Le7/e0;->g:Lkotlin/jvm/functions/Function1;

    iput-boolean p8, p0, Le7/e0;->h:Z

    iput-object p9, p0, Le7/e0;->i:Landroidx/compose/ui/text/TextStyle;

    iput-object p10, p0, Le7/e0;->j:Landroidx/compose/foundation/text/KeyboardOptions;

    iput-boolean p11, p0, Le7/e0;->k:Z

    iput-object p12, p0, Le7/e0;->l:Lkotlin/jvm/functions/Function0;

    iput-object p13, p0, Le7/e0;->m:Ljava/lang/String;

    iput-object p14, p0, Le7/e0;->n:Landroidx/compose/ui/text/TextStyle;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Le7/e0;->a:Lkotlin/jvm/functions/Function2;

    iget-object v2, v0, Le7/e0;->b:Landroidx/compose/ui/focus/FocusManager;

    iget-object v3, v0, Le7/e0;->c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v4, v0, Le7/e0;->d:Ljava/lang/String;

    iget-object v5, v0, Le7/e0;->e:Lkotlin/jvm/functions/Function1;

    iget v6, v0, Le7/e0;->f:I

    iget-object v7, v0, Le7/e0;->g:Lkotlin/jvm/functions/Function1;

    iget-boolean v8, v0, Le7/e0;->h:Z

    iget-object v9, v0, Le7/e0;->i:Landroidx/compose/ui/text/TextStyle;

    iget-object v10, v0, Le7/e0;->j:Landroidx/compose/foundation/text/KeyboardOptions;

    iget-boolean v11, v0, Le7/e0;->k:Z

    iget-object v12, v0, Le7/e0;->l:Lkotlin/jvm/functions/Function0;

    iget-object v13, v0, Le7/e0;->m:Ljava/lang/String;

    iget-object v14, v0, Le7/e0;->n:Landroidx/compose/ui/text/TextStyle;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v16, p2

    check-cast v16, Ljava/lang/Integer;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    invoke-static/range {v1 .. v16}, Le7/k0;->c(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
