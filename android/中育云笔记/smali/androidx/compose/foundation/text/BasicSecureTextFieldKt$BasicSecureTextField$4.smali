.class final Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/BasicSecureTextFieldKt;->BasicSecureTextField-egD4TGM(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lhd/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/p;"
    }
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $$default:I

.field final synthetic $cursorBrush:Landroidx/compose/ui/graphics/Brush;

.field final synthetic $decorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

.field final synthetic $enabled:Z

.field final synthetic $inputTransformation:Landroidx/compose/foundation/text/input/InputTransformation;

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onKeyboardAction:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

.field final synthetic $onTextLayout:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $readOnly:Z

.field final synthetic $state:Landroidx/compose/foundation/text/input/TextFieldState;

.field final synthetic $textObfuscationCharacter:C

.field final synthetic $textObfuscationMode:I

.field final synthetic $textStyle:Landroidx/compose/ui/text/TextStyle;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lhd/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/TextFieldState;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/foundation/text/input/InputTransformation;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/input/KeyboardActionHandler;",
            "Lhd/p;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
            "Landroidx/compose/foundation/text/input/TextFieldDecorator;",
            "ICIII)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$state:Landroidx/compose/foundation/text/input/TextFieldState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$modifier:Landroidx/compose/ui/Modifier;

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$enabled:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$readOnly:Z

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$inputTransformation:Landroidx/compose/foundation/text/input/InputTransformation;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$onKeyboardAction:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

    .line 16
    .line 17
    iput-object p9, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$onTextLayout:Lhd/p;

    .line 18
    .line 19
    iput-object p10, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 20
    .line 21
    iput-object p11, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$cursorBrush:Landroidx/compose/ui/graphics/Brush;

    .line 22
    .line 23
    iput-object p12, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$decorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

    .line 24
    .line 25
    iput p13, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$textObfuscationMode:I

    .line 26
    .line 27
    iput-char p14, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$textObfuscationCharacter:C

    .line 28
    .line 29
    iput p15, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$$changed:I

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput p1, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$$changed1:I

    .line 34
    .line 35
    move/from16 p1, p17

    .line 36
    .line 37
    iput p1, p0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$$default:I

    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    .line 2
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$state:Landroidx/compose/foundation/text/input/TextFieldState;

    iget-object v2, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v3, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$enabled:Z

    iget-boolean v4, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$readOnly:Z

    iget-object v5, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$inputTransformation:Landroidx/compose/foundation/text/input/InputTransformation;

    iget-object v6, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    iget-object v7, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    iget-object v8, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$onKeyboardAction:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

    iget-object v9, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$onTextLayout:Lhd/p;

    iget-object v10, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v11, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$cursorBrush:Landroidx/compose/ui/graphics/Brush;

    iget-object v12, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$decorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

    iget v13, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$textObfuscationMode:I

    iget-char v14, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$textObfuscationCharacter:C

    iget v15, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$$changed:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v15, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$$changed1:I

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v17

    iget v15, v0, Landroidx/compose/foundation/text/BasicSecureTextFieldKt$BasicSecureTextField$4;->$$default:I

    move/from16 v18, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, Landroidx/compose/foundation/text/BasicSecureTextFieldKt;->BasicSecureTextField-egD4TGM(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lhd/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V

    return-void
.end method
