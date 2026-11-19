.class public final synthetic Ll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lm/b;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/compose/ui/Modifier;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Landroidx/compose/ui/Alignment;

.field public final synthetic g:Landroidx/compose/ui/layout/ContentScale;

.field public final synthetic h:F

.field public final synthetic i:Landroidx/compose/ui/graphics/ColorFilter;

.field public final synthetic j:I

.field public final synthetic k:Z

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/a;->a:Lm/b;

    iput-object p2, p0, Ll/a;->b:Ljava/lang/String;

    iput-object p3, p0, Ll/a;->c:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Ll/a;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll/a;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll/a;->f:Landroidx/compose/ui/Alignment;

    iput-object p7, p0, Ll/a;->g:Landroidx/compose/ui/layout/ContentScale;

    iput p8, p0, Ll/a;->h:F

    iput-object p9, p0, Ll/a;->i:Landroidx/compose/ui/graphics/ColorFilter;

    iput p10, p0, Ll/a;->j:I

    iput-boolean p11, p0, Ll/a;->k:Z

    iput p12, p0, Ll/a;->l:I

    iput p13, p0, Ll/a;->m:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Ll/a;->a:Lm/b;

    iget-object v2, v0, Ll/a;->b:Ljava/lang/String;

    iget-object v3, v0, Ll/a;->c:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Ll/a;->d:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ll/a;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Ll/a;->f:Landroidx/compose/ui/Alignment;

    iget-object v7, v0, Ll/a;->g:Landroidx/compose/ui/layout/ContentScale;

    iget v8, v0, Ll/a;->h:F

    iget-object v9, v0, Ll/a;->i:Landroidx/compose/ui/graphics/ColorFilter;

    iget v10, v0, Ll/a;->j:I

    iget-boolean v11, v0, Ll/a;->k:Z

    iget v12, v0, Ll/a;->l:I

    iget v13, v0, Ll/a;->m:I

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v15, p2

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-static/range {v1 .. v15}, Lcoil3/compose/a;->a(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
