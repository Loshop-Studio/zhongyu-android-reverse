.class public Lcom/friday/lecture/DataBinderMapperImpl;
.super Landroidx/databinding/DataBinderMapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/DataBinderMapperImpl$b;,
        Lcom/friday/lecture/DataBinderMapperImpl$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/friday/lecture/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    sget v2, Lcom/friday/lecture/R$layout;->float_view:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 14
    .line 15
    .line 16
    sget v2, Lcom/friday/lecture/R$layout;->item_online_list:I

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    .line 21
    .line 22
    sget v2, Lcom/friday/lecture/R$layout;->layout_before_stop_answer:I

    .line 23
    .line 24
    const/4 v3, 0x3

    .line 25
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 26
    .line 27
    .line 28
    sget v2, Lcom/friday/lecture/R$layout;->layout_confirm_end_class:I

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 32
    .line 33
    .line 34
    sget v2, Lcom/friday/lecture/R$layout;->layout_confirm_time_up:I

    .line 35
    .line 36
    const/4 v3, 0x5

    .line 37
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 38
    .line 39
    .line 40
    sget v2, Lcom/friday/lecture/R$layout;->layout_random:I

    .line 41
    .line 42
    const/4 v3, 0x6

    .line 43
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    sget v2, Lcom/friday/lecture/R$layout;->layout_simple_canvas:I

    .line 47
    .line 48
    const/4 v3, 0x7

    .line 49
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 50
    .line 51
    .line 52
    sget v2, Lcom/friday/lecture/R$layout;->layout_subjective_detail:I

    .line 53
    .line 54
    const/16 v3, 0x8

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 57
    .line 58
    .line 59
    sget v2, Lcom/friday/lecture/R$layout;->layout_subjective_list:I

    .line 60
    .line 61
    const/16 v3, 0x9

    .line 62
    .line 63
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 64
    .line 65
    .line 66
    sget v2, Lcom/friday/lecture/R$layout;->lecture_dialog_fragment:I

    .line 67
    .line 68
    const/16 v3, 0xa

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 71
    .line 72
    .line 73
    sget v2, Lcom/friday/lecture/R$layout;->view_in_demo:I

    .line 74
    .line 75
    const/16 v3, 0xb

    .line 76
    .line 77
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 78
    .line 79
    .line 80
    sget v2, Lcom/friday/lecture/R$layout;->window_danmaku:I

    .line 81
    .line 82
    const/16 v3, 0xc

    .line 83
    .line 84
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 85
    .line 86
    .line 87
    sget v2, Lcom/friday/lecture/R$layout;->window_student_demo_list:I

    .line 88
    .line 89
    const/16 v3, 0xd

    .line 90
    .line 91
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 92
    .line 93
    .line 94
    sget v2, Lcom/friday/lecture/R$layout;->window_subjective_answer:I

    .line 95
    .line 96
    const/16 v3, 0xe

    .line 97
    .line 98
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 99
    .line 100
    .line 101
    sget v2, Lcom/friday/lecture/R$layout;->window_view_objective_answer:I

    .line 102
    .line 103
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/databinding/DataBinderMapper;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public collectDependencies()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;

    .line 8
    .line 9
    invoke-direct {v1}, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/friday/common/DataBinderMapperImpl;

    .line 16
    .line 17
    invoke-direct {v1}, Lcom/friday/common/DataBinderMapperImpl;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    new-instance v1, Lcom/zykj/download/DataBinderMapperImpl;

    .line 24
    .line 25
    invoke-direct {v1}, Lcom/zykj/download/DataBinderMapperImpl;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    new-instance v1, Lcom/zykj/policy/DataBinderMapperImpl;

    .line 32
    .line 33
    invoke-direct {v1}, Lcom/zykj/policy/DataBinderMapperImpl;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v1, Lcom/zykj/view/DataBinderMapperImpl;

    .line 40
    .line 41
    invoke-direct {v1}, Lcom/zykj/view/DataBinderMapperImpl;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public convertBrIdToString(I)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/DataBinderMapperImpl$a;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public getDataBinder(Landroidx/databinding/DataBindingComponent;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p3

    if-lez p3, :cond_10

    .line 2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_f

    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 3
    :pswitch_0
    const-string p3, "layout/window_view_objective_answer_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 4
    new-instance p3, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for window_view_objective_answer is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :pswitch_1
    const-string p3, "layout/window_subjective_answer_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 7
    new-instance p3, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for window_subjective_answer is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :pswitch_2
    const-string p3, "layout/window_student_demo_list_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 10
    new-instance p3, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 11
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for window_student_demo_list is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :pswitch_3
    const-string p3, "layout/window_danmaku_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 13
    new-instance p3, Lcom/friday/lecture/databinding/WindowDanmakuBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/WindowDanmakuBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 14
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for window_danmaku is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :pswitch_4
    const-string p3, "layout/view_in_demo_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 16
    new-instance p3, Lcom/friday/lecture/databinding/ViewInDemoBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/ViewInDemoBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 17
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for view_in_demo is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :pswitch_5
    const-string p3, "layout/lecture_dialog_fragment_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 19
    new-instance p3, Lcom/friday/lecture/databinding/LectureDialogFragmentBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LectureDialogFragmentBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 20
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for lecture_dialog_fragment is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :pswitch_6
    const-string p3, "layout/layout_subjective_list_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 22
    new-instance p3, Lcom/friday/lecture/databinding/LayoutSubjectiveListBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LayoutSubjectiveListBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 23
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for layout_subjective_list is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :pswitch_7
    const-string p3, "layout/layout_subjective_detail_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 25
    new-instance p3, Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 26
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for layout_subjective_detail is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :pswitch_8
    const-string p3, "layout/layout_simple_canvas_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 28
    new-instance p3, Lcom/friday/lecture/databinding/LayoutSimpleCanvasBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LayoutSimpleCanvasBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 29
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for layout_simple_canvas is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :pswitch_9
    const-string p3, "layout/layout_random_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 31
    new-instance p3, Lcom/friday/lecture/databinding/LayoutRandomBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LayoutRandomBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 32
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for layout_random is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :pswitch_a
    const-string p3, "layout/layout_confirm_time_up_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 34
    new-instance p3, Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 35
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for layout_confirm_time_up is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :pswitch_b
    const-string p3, "layout/layout_confirm_end_class_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_b

    .line 37
    new-instance p3, Lcom/friday/lecture/databinding/LayoutConfirmEndClassBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LayoutConfirmEndClassBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 38
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for layout_confirm_end_class is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 39
    :pswitch_c
    const-string p3, "layout/layout_before_stop_answer_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_c

    .line 40
    new-instance p3, Lcom/friday/lecture/databinding/LayoutBeforeStopAnswerBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/LayoutBeforeStopAnswerBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 41
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for layout_before_stop_answer is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 42
    :pswitch_d
    const-string p3, "layout/item_online_list_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_d

    .line 43
    new-instance p3, Lcom/friday/lecture/databinding/ItemOnlineListBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/ItemOnlineListBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 44
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for item_online_list is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 45
    :pswitch_e
    const-string p3, "layout/float_view_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    .line 46
    new-instance p3, Lcom/friday/lecture/databinding/FloatViewBindingImpl;

    invoke-direct {p3, p1, p2}, Lcom/friday/lecture/databinding/FloatViewBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V

    return-object p3

    .line 47
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The tag for float_view is invalid. Received: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_f
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "view must have a tag"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getDataBinder(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;
    .locals 1

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    .line 49
    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    sget-object v0, Lcom/friday/lecture/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p3

    if-lez p3, :cond_2

    const/4 p3, 0x0

    .line 51
    aget-object p2, p2, p3

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "view must have a tag"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public getLayoutId(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, Lcom/friday/lecture/DataBinderMapperImpl$b;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method
