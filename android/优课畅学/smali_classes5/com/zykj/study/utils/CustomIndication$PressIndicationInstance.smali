.class public final Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/DrawModifierNode;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/utils/CustomIndication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PressIndicationInstance"
.end annotation


# instance fields
.field public final a:Landroidx/compose/foundation/interaction/InteractionSource;

.field public b:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/interaction/InteractionSource;)V
    .locals 1

    .line 1
    const-string v0, "interactionSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;->a:Landroidx/compose/foundation/interaction/InteractionSource;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;)Landroidx/compose/foundation/interaction/InteractionSource;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;->a:Landroidx/compose/foundation/interaction/InteractionSource;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic c(Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;->b:Z

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public draw(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 14

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 7
    .line 8
    .line 9
    iget-boolean v2, p0, Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;->b:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    const/16 v9, 0xe

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    const/high16 v5, 0x3f000000    # 0.5f

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    const/16 v12, 0x7a

    .line 36
    .line 37
    const/4 v13, 0x0

    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    move-object v1, p1

    .line 43
    invoke-static/range {v1 .. v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public onAttach()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance$onAttach$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance$onAttach$1;-><init>(Lcom/zykj/study/utils/CustomIndication$PressIndicationInstance;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onMeasureResultChanged()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/node/DrawModifierNode;->onMeasureResultChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
