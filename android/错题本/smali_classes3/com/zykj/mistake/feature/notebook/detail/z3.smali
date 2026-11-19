.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/z3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;II)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/entity/resp/MistakeDetailResp;

    .line 7
    .line 8
    const-string v0, "resp"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 14
    .line 15
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 16
    .line 17
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 22
    .line 23
    iget v1, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 24
    .line 25
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->c:I

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetailResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->k(Lcom/zykj/mistake/entity/resp/MistakeDetail;ZLjava/util/List;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v3, 0x4

    .line 43
    invoke-static {v0, v2, p1, v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->h0(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ILcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;

    .line 50
    .line 51
    const-string v0, "resp"

    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 57
    .line 58
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 59
    .line 60
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 65
    .line 66
    iget v1, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 67
    .line 68
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->c:I

    .line 69
    .line 70
    if-ne v1, v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;->getResult()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-nez p1, :cond_1

    .line 77
    .line 78
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 79
    .line 80
    :cond_1
    invoke-static {p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->A(Ljava/util/List;)Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v3, 0x1

    .line 85
    invoke-virtual {v0, v1, v3, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->k(Lcom/zykj/mistake/entity/resp/MistakeDetail;ZLjava/util/List;)V

    .line 86
    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    const/4 v3, 0x2

    .line 90
    invoke-static {v0, v2, v1, p1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->h0(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ILcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;I)V

    .line 91
    .line 92
    .line 93
    :cond_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/entity/resp/MistakeDetailResp;

    .line 97
    .line 98
    const-string v0, "resp"

    .line 99
    .line 100
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 104
    .line 105
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 106
    .line 107
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 112
    .line 113
    iget v1, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 114
    .line 115
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/z3;->c:I

    .line 116
    .line 117
    if-ne v1, v2, :cond_3

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetailResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p1, :cond_3

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 127
    .line 128
    invoke-virtual {v0, p1, v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->k(Lcom/zykj/mistake/entity/resp/MistakeDetail;ZLjava/util/List;)V

    .line 129
    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    const/4 v3, 0x4

    .line 133
    invoke-static {v0, v2, p1, v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->h0(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ILcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;I)V

    .line 134
    .line 135
    .line 136
    :cond_3
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 137
    .line 138
    return-object p1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
