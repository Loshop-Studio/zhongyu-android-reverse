.class public final Landroidx/compose/foundation/text/SecureTextFieldController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000cR\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/foundation/text/SecureTextFieldController;",
        "",
        "Landroidx/compose/runtime/State;",
        "",
        "obfuscationMaskState",
        "<init>",
        "(Landroidx/compose/runtime/State;)V",
        "Ld6/s;",
        "scheduleHide",
        "()V",
        "observeHideEvents",
        "(Lh6/c;)Ljava/lang/Object;",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/foundation/text/PasswordInputTransformation;",
        "passwordInputTransformation",
        "Landroidx/compose/foundation/text/PasswordInputTransformation;",
        "getPasswordInputTransformation",
        "()Landroidx/compose/foundation/text/PasswordInputTransformation;",
        "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;",
        "codepointTransformation",
        "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;",
        "getCodepointTransformation",
        "()Landroidx/compose/foundation/text/input/internal/CodepointTransformation;",
        "Landroidx/compose/ui/Modifier;",
        "focusChangeModifier",
        "Landroidx/compose/ui/Modifier;",
        "getFocusChangeModifier",
        "()Landroidx/compose/ui/Modifier;",
        "Lkotlinx/coroutines/channels/e;",
        "resetTimerSignal",
        "Lkotlinx/coroutines/channels/e;",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final codepointTransformation:Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusChangeModifier:Landroidx/compose/ui/Modifier;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final obfuscationMaskState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final passwordInputTransformation:Landroidx/compose/foundation/text/PasswordInputTransformation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final resetTimerSignal:Lkotlinx/coroutines/channels/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/e;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/State;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Character;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->obfuscationMaskState:Landroidx/compose/runtime/State;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/foundation/text/PasswordInputTransformation;

    .line 7
    .line 8
    new-instance v0, Landroidx/compose/foundation/text/SecureTextFieldController$passwordInputTransformation$1;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/SecureTextFieldController$passwordInputTransformation$1;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0}, Landroidx/compose/foundation/text/PasswordInputTransformation;-><init>(Lr6/a;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->passwordInputTransformation:Landroidx/compose/foundation/text/PasswordInputTransformation;

    .line 17
    .line 18
    new-instance p1, Landroidx/compose/foundation/text/a;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, p0, v0}, Landroidx/compose/foundation/text/a;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->codepointTransformation:Landroidx/compose/foundation/text/input/internal/CodepointTransformation;

    .line 25
    .line 26
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 27
    .line 28
    new-instance v0, Landroidx/compose/foundation/text/SecureTextFieldController$focusChangeModifier$1;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/SecureTextFieldController$focusChangeModifier$1;-><init>(Landroidx/compose/foundation/text/SecureTextFieldController;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, Landroidx/compose/ui/focus/FocusChangedModifierKt;->onFocusChanged(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->focusChangeModifier:Landroidx/compose/ui/Modifier;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    const/4 v0, 0x6

    .line 41
    const v1, 0x7fffffff

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0, p1}, Lkotlinx/coroutines/channels/k;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/b;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->resetTimerSignal:Lkotlinx/coroutines/channels/e;

    .line 49
    .line 50
    return-void
.end method

.method public static synthetic a(Landroidx/compose/foundation/text/SecureTextFieldController;II)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/SecureTextFieldController;->codepointTransformation$lambda$0(Landroidx/compose/foundation/text/SecureTextFieldController;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$scheduleHide(Landroidx/compose/foundation/text/SecureTextFieldController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/SecureTextFieldController;->scheduleHide()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final codepointTransformation$lambda$0(Landroidx/compose/foundation/text/SecureTextFieldController;II)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->passwordInputTransformation:Landroidx/compose/foundation/text/PasswordInputTransformation;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text/PasswordInputTransformation;->getRevealCodepointIndex$foundation_release()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    return p2

    .line 10
    :cond_0
    iget-object p0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->obfuscationMaskState:Landroidx/compose/runtime/State;

    .line 11
    .line 12
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Character;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method private final scheduleHide()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->resetTimerSignal:Lkotlinx/coroutines/channels/e;

    .line 2
    .line 3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v0, v0, Lkotlinx/coroutines/channels/g;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->passwordInputTransformation:Landroidx/compose/foundation/text/PasswordInputTransformation;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/foundation/text/PasswordInputTransformation;->hide()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public final getCodepointTransformation()Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->codepointTransformation:Landroidx/compose/foundation/text/input/internal/CodepointTransformation;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFocusChangeModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->focusChangeModifier:Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPasswordInputTransformation()Landroidx/compose/foundation/text/PasswordInputTransformation;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->passwordInputTransformation:Landroidx/compose/foundation/text/PasswordInputTransformation;

    .line 2
    .line 3
    return-object v0
.end method

.method public final observeHideEvents(Lh6/c;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController;->resetTimerSignal:Lkotlinx/coroutines/channels/e;

    .line 2
    .line 3
    new-instance v1, Lkotlinx/coroutines/flow/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v0, v2}, Lkotlinx/coroutines/flow/c;-><init>(Lkotlinx/coroutines/channels/o;Z)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, p0, v2}, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;-><init>(Landroidx/compose/foundation/text/SecureTextFieldController;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0, p1}, Lkotlinx/coroutines/flow/h;->h(Lkotlinx/coroutines/flow/f;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 25
    .line 26
    return-object p1
.end method
