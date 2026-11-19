.class public final synthetic Lg3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/unit/Density;

.field public final synthetic b:Landroidx/compose/ui/Modifier;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:J

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;

.field public final synthetic j:J

.field public final synthetic k:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/h;->a:Landroidx/compose/ui/unit/Density;

    iput-object p2, p0, Lg3/h;->b:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg3/h;->c:Ljava/lang/String;

    iput-object p4, p0, Lg3/h;->d:Ljava/lang/String;

    iput-object p5, p0, Lg3/h;->e:Ljava/lang/String;

    iput-object p6, p0, Lg3/h;->f:Ljava/lang/String;

    iput-wide p7, p0, Lg3/h;->g:J

    iput-object p9, p0, Lg3/h;->h:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, Lg3/h;->i:Lkotlin/jvm/functions/Function0;

    iput-wide p11, p0, Lg3/h;->j:J

    iput-object p13, p0, Lg3/h;->k:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lg3/h;->a:Landroidx/compose/ui/unit/Density;

    iget-object v2, v0, Lg3/h;->b:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lg3/h;->c:Ljava/lang/String;

    iget-object v4, v0, Lg3/h;->d:Ljava/lang/String;

    iget-object v5, v0, Lg3/h;->e:Ljava/lang/String;

    iget-object v6, v0, Lg3/h;->f:Ljava/lang/String;

    iget-wide v7, v0, Lg3/h;->g:J

    iget-object v9, v0, Lg3/h;->h:Lkotlin/jvm/functions/Function0;

    iget-object v10, v0, Lg3/h;->i:Lkotlin/jvm/functions/Function0;

    iget-wide v11, v0, Lg3/h;->j:J

    iget-object v13, v0, Lg3/h;->k:Lkotlin/jvm/functions/Function0;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v15, p2

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-static/range {v1 .. v15}, Lg3/j;->e(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
