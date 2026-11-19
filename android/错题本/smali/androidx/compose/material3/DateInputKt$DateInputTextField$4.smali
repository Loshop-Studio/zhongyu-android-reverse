.class final Landroidx/compose/material3/DateInputKt$DateInputTextField$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DateInputKt;->DateInputTextField-tQNruF0(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lr6/e;Lr6/e;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $calendarModel:Landroidx/compose/material3/internal/CalendarModel;

.field final synthetic $colors:Landroidx/compose/material3/DatePickerColors;

.field final synthetic $dateInputFormat:Landroidx/compose/material3/internal/DateInputFormat;

.field final synthetic $dateInputValidator:Landroidx/compose/material3/DateInputValidator;

.field final synthetic $initialDateMillis:Ljava/lang/Long;

.field final synthetic $inputIdentifier:I

.field final synthetic $label:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation
.end field

.field final synthetic $locale:Ljava/util/Locale;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onDateSelectionChange:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lr6/e;Lr6/e;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/Long;",
            "Lr6/c;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lr6/e;",
            "Lr6/e;",
            "I",
            "Landroidx/compose/material3/DateInputValidator;",
            "Landroidx/compose/material3/internal/DateInputFormat;",
            "Ljava/util/Locale;",
            "Landroidx/compose/material3/DatePickerColors;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$modifier:Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$initialDateMillis:Ljava/lang/Long;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$onDateSelectionChange:Lr6/c;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$calendarModel:Landroidx/compose/material3/internal/CalendarModel;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$label:Lr6/e;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$placeholder:Lr6/e;

    .line 12
    .line 13
    iput p7, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$inputIdentifier:I

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$dateInputValidator:Landroidx/compose/material3/DateInputValidator;

    .line 16
    .line 17
    iput-object p9, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$dateInputFormat:Landroidx/compose/material3/internal/DateInputFormat;

    .line 18
    .line 19
    iput-object p10, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$locale:Ljava/util/Locale;

    .line 20
    .line 21
    iput-object p11, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$colors:Landroidx/compose/material3/DatePickerColors;

    .line 22
    .line 23
    iput p12, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$$changed:I

    .line 24
    .line 25
    iput p13, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$$changed1:I

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 29
    .line 30
    .line 31
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 14
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$initialDateMillis:Ljava/lang/Long;

    iget-object v2, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$onDateSelectionChange:Lr6/c;

    iget-object v3, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$calendarModel:Landroidx/compose/material3/internal/CalendarModel;

    iget-object v4, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$label:Lr6/e;

    iget-object v5, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$placeholder:Lr6/e;

    iget v6, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$inputIdentifier:I

    iget-object v7, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$dateInputValidator:Landroidx/compose/material3/DateInputValidator;

    iget-object v8, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$dateInputFormat:Landroidx/compose/material3/internal/DateInputFormat;

    iget-object v9, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$locale:Ljava/util/Locale;

    iget-object v10, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$colors:Landroidx/compose/material3/DatePickerColors;

    iget v11, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$$changed:I

    or-int/lit8 v11, v11, 0x1

    invoke-static {v11}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v12

    iget v11, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;->$$changed1:I

    invoke-static {v11}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v13

    move-object v11, p1

    invoke-static/range {v0 .. v13}, Landroidx/compose/material3/DateInputKt;->DateInputTextField-tQNruF0(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lr6/e;Lr6/e;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
