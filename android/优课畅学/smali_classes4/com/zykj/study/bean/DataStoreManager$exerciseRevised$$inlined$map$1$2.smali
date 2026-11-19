.class public final Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ll8/d;"
    }
.end annotation


# instance fields
.field final synthetic $keyName$inlined:Ljava/lang/String;

.field final synthetic $this_unsafeFlow:Ll8/d;


# direct methods
.method public constructor <init>(Ll8/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;->$this_unsafeFlow:Ll8/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;->$keyName$inlined:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;-><init>(Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ll8/d;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;->$this_unsafeFlow:Ll8/d;

    .line 62
    .line 63
    move-object v2, p1

    .line 64
    check-cast v2, Landroidx/datastore/preferences/core/Preferences;

    .line 65
    .line 66
    iget-object v4, p0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2;->$keyName$inlined:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v4}, Landroidx/datastore/preferences/core/PreferencesKeys;->booleanKey(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v2, v4}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/lang/Boolean;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move v2, v4

    .line 87
    :goto_1
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    iput-object v5, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iput-object v5, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 114
    .line 115
    iput v4, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->I$0:I

    .line 116
    .line 117
    iput v3, v0, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2$1;->label:I

    .line 118
    .line 119
    invoke-interface {p2, v2, v0}, Ll8/d;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v1, :cond_4

    .line 124
    .line 125
    return-object v1

    .line 126
    :cond_4
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 127
    .line 128
    return-object p1
.end method
