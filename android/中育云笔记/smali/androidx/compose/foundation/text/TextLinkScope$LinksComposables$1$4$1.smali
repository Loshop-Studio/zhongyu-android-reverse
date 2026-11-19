.class final Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/TextLinkScope;->LinksComposables(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $linkStateObserver:Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;

.field final synthetic $range:Landroidx/compose/ui/text/AnnotatedString$Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/foundation/text/TextLinkScope;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/TextLinkScope;",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;",
            "Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->this$0:Landroidx/compose/foundation/text/TextLinkScope;

    iput-object p2, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    iput-object p3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$linkStateObserver:Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text/TextAnnotatorScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->invoke(Landroidx/compose/foundation/text/TextAnnotatorScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/text/TextAnnotatorScope;)V
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->this$0:Landroidx/compose/foundation/text/TextLinkScope;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/text/LinkAnnotation;

    invoke-virtual {v1}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLinkStyles;->getStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 5
    :goto_0
    iget-object v3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$linkStateObserver:Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;->isFocused()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-virtual {v3}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/text/LinkAnnotation;

    invoke-virtual {v3}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLinkStyles;->getFocusedStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    .line 6
    :goto_1
    invoke-static {v0, v1, v3}, Landroidx/compose/foundation/text/TextLinkScope;->access$mergeOrUse(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;

    move-result-object v1

    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$linkStateObserver:Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;->isHovered()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-virtual {v3}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/text/LinkAnnotation;

    invoke-virtual {v3}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLinkStyles;->getHoveredStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    .line 8
    :goto_2
    invoke-static {v0, v1, v3}, Landroidx/compose/foundation/text/TextLinkScope;->access$mergeOrUse(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;

    move-result-object v1

    .line 9
    iget-object v3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$linkStateObserver:Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;->isPressed()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-virtual {v3}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/text/LinkAnnotation;

    invoke-virtual {v3}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLinkStyles;->getPressedStyle()Landroidx/compose/ui/text/SpanStyle;

    move-result-object v2

    .line 10
    :cond_3
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/text/TextLinkScope;->access$mergeOrUse(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;

    move-result-object v0

    .line 11
    iget-object v1, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-virtual {p1, v1, v0}, Landroidx/compose/foundation/text/TextAnnotatorScope;->replaceStyle(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/SpanStyle;)V

    return-void
.end method
