package com.example.restapiexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("response")
    @Expose
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public static class Response {

        @SerializedName("header")
        @Expose
        private Header header;
        @SerializedName("body")
        @Expose
        private Body body;

        public Header getHeader() {
            return header;
        }

        public void setHeader(Header header) {
            this.header = header;
        }

        public Body getBody() {
            return body;
        }

        public void setBody(Body body) {
            this.body = body;
        }

        public static class Header {

            @SerializedName("resultCode")
            @Expose
            private String resultCode;
            @SerializedName("resultMsg")
            @Expose
            private String resultMsg;

            public String getResultCode() {
                return resultCode;
            }

            public void setResultCode(String resultCode) {
                this.resultCode = resultCode;
            }

            public String getResultMsg() {
                return resultMsg;
            }

            public void setResultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
            }

        }

        public static class Body {

            @SerializedName("dataType")
            @Expose
            private String dataType;
            @SerializedName("items")
            @Expose
            private Items items;
            @SerializedName("pageNo")
            @Expose
            private String pageNo;
            @SerializedName("numOfRows")
            @Expose
            private String numOfRows;
            @SerializedName("totalCount")
            @Expose
            private String totalCount;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public Items getItems() {
                return items;
            }

            public void setItems(Items items) {
                this.items = items;
            }

            public String getPageNo() {
                return pageNo;
            }

            public void setPageNo(String pageNo) {
                this.pageNo = pageNo;
            }

            public String getNumOfRows() {
                return numOfRows;
            }

            public void setNumOfRows(String numOfRows) {
                this.numOfRows = numOfRows;
            }

            public String getTotalCount() {
                return totalCount;
            }

            public void setTotalCount(String totalCount) {
                this.totalCount = totalCount;
            }

            public static class Items {

                @SerializedName("item")
                @Expose
                private List<Item> item = null;

                public List<Item> getItem() {
                    return item;
                }

                public void setItem(List<Item> item) {
                    this.item = item;
                }

                public static class Item {

                    @SerializedName("baseDate")
                    @Expose
                    private String baseDate;
                    @SerializedName("baseTime")
                    @Expose
                    private String baseTime;
                    @SerializedName("category")
                    @Expose
                    private String category;
                    @SerializedName("nx")
                    @Expose
                    private String nx;
                    @SerializedName("ny")
                    @Expose
                    private String ny;
                    @SerializedName("obsrValue")
                    @Expose
                    private String obsrValue;

                    public String getBaseDate() {
                        return baseDate;
                    }

                    public void setBaseDate(String baseDate) {
                        this.baseDate = baseDate;
                    }

                    public String getBaseTime() {
                        return baseTime;
                    }

                    public void setBaseTime(String baseTime) {
                        this.baseTime = baseTime;
                    }

                    public String getCategory() {
                        return category;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

                    public String getNx() {
                        return nx;
                    }

                    public void setNx(String nx) {
                        this.nx = nx;
                    }

                    public String getNy() {
                        return ny;
                    }

                    public void setNy(String ny) {
                        this.ny = ny;
                    }

                    public String getObsrValue() {
                        return obsrValue;
                    }

                    public void setObsrValue(String obsrValue) {
                        this.obsrValue = obsrValue;
                    }

                }
            }
        }
    }
}
