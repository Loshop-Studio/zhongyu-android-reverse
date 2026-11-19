.class public final synthetic Lg3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Z

.field public final synthetic c:Landroidx/compose/ui/unit/Density;

.field public final synthetic d:Landroidx/compose/ui/Modifier;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:J

.field public final synthetic l:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/f;->a:Lkotlin/jvm/functions/Function0;

    iput-boolean p2, p0, Lg3/f;->b:Z

    iput-object p3, p0, Lg3/f;->c:Landroidx/compose/ui/unit/Density;

    iput-object p4, p0, Lg3/f;->d:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lg3/f;->e:Ljava/lang/String;

    iput-object p6, p0, Lg3/f;->f:Ljava/lang/String;

    iput-object p7, p0, Lg3/f;->g:Ljava/lang/String;

    iput-object p8, p0, Lg3/f;->h:Ljava/lang/String;

    iput-wide p9, p0, Lg3/f;->i:J

    iput-object p11, p0, Lg3/f;->j:Lkotlin/jvm/functions/Function0;

    iput-wide p12, p0, Lg3/f;->k:J

    iput-object p14, p0, Lg3/f;->l:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lg3/f;->a:Lkotlin/jvm/functions/Function0;

    iget-boolean v2, v0, Lg3/f;->b:Z

    iget-object v3, v0, Lg3/f;->c:Landroidx/compose/ui/unit/Density;

    iget-object v4, v0, Lg3/f;->d:Landroidx/compose/ui/Modifier;

    iget-object v5, v0, Lg3/f;->e:Ljava/lang/String;

    iget-object v6, v0, Lg3/f;->f:Ljava/lang/String;

    iget-object v7, v0, Lg3/f;->g:Ljava/lang/String;

    iget-object v8, v0, Lg3/f;->h:Ljava/lang/String;

    iget-wide v9, v0, Lg3/f;->i:J

    iget-object v11, v0, Lg3/f;->j:Lkotlin/jvm/functions/Function0;

    iget-wide v12, v0, Lg3/f;->k:J

    iget-object v14, v0, Lg3/f;->l:Lkotlin/jvm/functions/Function0;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/animation/AnimatedVisibilityScope;

    move-object/from16 v16, p2

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v17, p3

    check-cast v17, Ljava/lang/Integer;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v17

    invoke-static/range {v1 .. v17}, Lg3/j;->b(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
