.class Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citycustome/CustomCityPicker;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$300(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$400(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$000(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCityDataList()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/lljjcoder/bean/CustomCityData;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$200(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lcom/lljjcoder/bean/CustomCityData;

    .line 44
    .line 45
    invoke-direct {v1}, Lcom/lljjcoder/bean/CustomCityData;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lcom/lljjcoder/bean/CustomCityData;

    .line 49
    .line 50
    invoke-direct {v2}, Lcom/lljjcoder/bean/CustomCityData;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1, v1, v2}, Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;->onSelected(Lcom/lljjcoder/bean/CustomCityData;Lcom/lljjcoder/bean/CustomCityData;Lcom/lljjcoder/bean/CustomCityData;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_0
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$300(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 65
    .line 66
    if-ne p1, v0, :cond_2

    .line 67
    .line 68
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$400(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 79
    .line 80
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$000(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCityDataList()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lcom/lljjcoder/bean/CustomCityData;

    .line 93
    .line 94
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 95
    .line 96
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$500(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {p1}, Lcom/lljjcoder/bean/CustomCityData;->getList()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-nez v1, :cond_1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lcom/lljjcoder/bean/CustomCityData;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 118
    .line 119
    invoke-static {v1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$200(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v2, Lcom/lljjcoder/bean/CustomCityData;

    .line 124
    .line 125
    invoke-direct {v2}, Lcom/lljjcoder/bean/CustomCityData;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, p1, v0, v2}, Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;->onSelected(Lcom/lljjcoder/bean/CustomCityData;Lcom/lljjcoder/bean/CustomCityData;Lcom/lljjcoder/bean/CustomCityData;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 133
    .line 134
    invoke-static {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$300(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    sget-object v0, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 139
    .line 140
    if-ne p1, v0, :cond_5

    .line 141
    .line 142
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 143
    .line 144
    invoke-static {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$400(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 153
    .line 154
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$000(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCityDataList()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Lcom/lljjcoder/bean/CustomCityData;

    .line 167
    .line 168
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 169
    .line 170
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$500(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {p1}, Lcom/lljjcoder/bean/CustomCityData;->getList()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-nez v1, :cond_3

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_3
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Lcom/lljjcoder/bean/CustomCityData;

    .line 190
    .line 191
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 192
    .line 193
    invoke-static {v1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$600(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CustomCityData;->getList()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    if-nez v2, :cond_4

    .line 206
    .line 207
    :goto_0
    return-void

    .line 208
    :cond_4
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Lcom/lljjcoder/bean/CustomCityData;

    .line 213
    .line 214
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 215
    .line 216
    invoke-static {v2}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$200(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2, p1, v0, v1}, Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;->onSelected(Lcom/lljjcoder/bean/CustomCityData;Lcom/lljjcoder/bean/CustomCityData;Lcom/lljjcoder/bean/CustomCityData;)V

    .line 221
    .line 222
    .line 223
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 224
    .line 225
    invoke-virtual {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->hide()V

    .line 226
    .line 227
    .line 228
    return-void
.end method
