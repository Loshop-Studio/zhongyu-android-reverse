.class public final Lcom/zykj/mistake/feature/home/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/lifecycle/ViewModel;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/ViewModel;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/home/g;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/home/g;->b:Landroidx/lifecycle/ViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/home/g;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget p2, p0, Lcom/zykj/mistake/feature/home/g;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/main/a0;

    .line 7
    .line 8
    iget-object p2, p0, Lcom/zykj/mistake/feature/home/g;->b:Landroidx/lifecycle/ViewModel;

    .line 9
    .line 10
    check-cast p2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 11
    .line 12
    sget-object v0, Lcom/zykj/mistake/main/v;->a:Lcom/zykj/mistake/main/v;

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object p1, Lcom/zykj/mistake/feature/notebook/list/i0;->a:Lcom/zykj/mistake/feature/notebook/list/i0;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    sget-object v0, Lcom/zykj/mistake/main/s;->a:Lcom/zykj/mistake/main/s;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/g;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 38
    .line 39
    sget-object p2, Lcom/zykj/mistake/feature/collection/list/n;->a:Lcom/zykj/mistake/feature/collection/list/n;

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->a(Lcom/zykj/mistake/feature/collection/list/u;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    instance-of v0, p1, Lcom/zykj/mistake/main/w;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    check-cast p1, Lcom/zykj/mistake/main/w;

    .line 50
    .line 51
    iget-object v0, p1, Lcom/zykj/mistake/main/w;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/mistake/main/TagEditorTarget;->NOTEBOOK:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 54
    .line 55
    if-eq v0, v1, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/l0;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/zykj/mistake/main/w;->b:Lcom/zykj/mistake/main/z0;

    .line 61
    .line 62
    iget-object v3, p1, Lcom/zykj/mistake/main/z0;->a:Ljava/lang/Integer;

    .line 63
    .line 64
    iget-object v4, p1, Lcom/zykj/mistake/main/z0;->b:Ljava/lang/Integer;

    .line 65
    .line 66
    iget-object v5, p1, Lcom/zykj/mistake/main/z0;->c:Ljava/lang/Integer;

    .line 67
    .line 68
    iget-object v6, p1, Lcom/zykj/mistake/main/z0;->d:Ljava/util/ArrayList;

    .line 69
    .line 70
    iget-object v7, p1, Lcom/zykj/mistake/main/z0;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct/range {v2 .. v7}, Lcom/zykj/mistake/feature/notebook/list/l0;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    instance-of v0, p1, Lcom/zykj/mistake/main/u;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/j0;

    .line 84
    .line 85
    check-cast p1, Lcom/zykj/mistake/main/u;

    .line 86
    .line 87
    iget-object p1, p1, Lcom/zykj/mistake/main/u;->a:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 88
    .line 89
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/list/j0;-><init>(Lcom/zykj/mistake/entity/req/MistakeListReq;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    instance-of v0, p1, Lcom/zykj/mistake/main/x;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    check-cast p1, Lcom/zykj/mistake/main/x;

    .line 101
    .line 102
    iget-object v0, p1, Lcom/zykj/mistake/main/x;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 103
    .line 104
    sget-object v1, Lcom/zykj/mistake/main/TagEditorTarget;->NOTEBOOK:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 105
    .line 106
    if-eq v0, v1, :cond_5

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/m0;

    .line 110
    .line 111
    iget-object p1, p1, Lcom/zykj/mistake/main/x;->b:Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/list/m0;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    instance-of v0, p1, Lcom/zykj/mistake/main/y;

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    check-cast p1, Lcom/zykj/mistake/main/y;

    .line 125
    .line 126
    iget-object v0, p1, Lcom/zykj/mistake/main/y;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 127
    .line 128
    sget-object v1, Lcom/zykj/mistake/main/TagEditorTarget;->NOTEBOOK:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 129
    .line 130
    if-eq v0, v1, :cond_7

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_7
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/q0;

    .line 134
    .line 135
    iget-object v1, p1, Lcom/zykj/mistake/main/y;->b:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v2, p1, Lcom/zykj/mistake/main/y;->c:Ljava/lang/String;

    .line 138
    .line 139
    iget-wide v3, p1, Lcom/zykj/mistake/main/y;->d:J

    .line 140
    .line 141
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/mistake/feature/notebook/list/q0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 145
    .line 146
    .line 147
    :cond_8
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 148
    .line 149
    return-object p1

    .line 150
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_9

    .line 157
    .line 158
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/g;->b:Landroidx/lifecycle/ViewModel;

    .line 159
    .line 160
    check-cast p1, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 161
    .line 162
    const/4 p2, 0x1

    .line 163
    iput-boolean p2, p1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 164
    .line 165
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/g;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    .line 168
    .line 169
    const-string p2, "nav_result_refresh_collection_list"

    .line 170
    .line 171
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_9
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 177
    .line 178
    return-object p1

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
