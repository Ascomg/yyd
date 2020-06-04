package com.yuyuedao.yydwechat.entity;

import java.util.ArrayList;
import java.util.List;

public class PosterQuestionDetailsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public PosterQuestionDetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionIsNull() {
            addCriterion("poster_question is null");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionIsNotNull() {
            addCriterion("poster_question is not null");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionEqualTo(String value) {
            addCriterion("poster_question =", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionNotEqualTo(String value) {
            addCriterion("poster_question <>", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionGreaterThan(String value) {
            addCriterion("poster_question >", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("poster_question >=", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionLessThan(String value) {
            addCriterion("poster_question <", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionLessThanOrEqualTo(String value) {
            addCriterion("poster_question <=", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionLike(String value) {
            addCriterion("poster_question like", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionNotLike(String value) {
            addCriterion("poster_question not like", value, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionIn(List<String> values) {
            addCriterion("poster_question in", values, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionNotIn(List<String> values) {
            addCriterion("poster_question not in", values, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionBetween(String value1, String value2) {
            addCriterion("poster_question between", value1, value2, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterQuestionNotBetween(String value1, String value2) {
            addCriterion("poster_question not between", value1, value2, "posterQuestion");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1IsNull() {
            addCriterion("poster_answer1 is null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1IsNotNull() {
            addCriterion("poster_answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1EqualTo(String value) {
            addCriterion("poster_answer1 =", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1NotEqualTo(String value) {
            addCriterion("poster_answer1 <>", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1GreaterThan(String value) {
            addCriterion("poster_answer1 >", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("poster_answer1 >=", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1LessThan(String value) {
            addCriterion("poster_answer1 <", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1LessThanOrEqualTo(String value) {
            addCriterion("poster_answer1 <=", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1Like(String value) {
            addCriterion("poster_answer1 like", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1NotLike(String value) {
            addCriterion("poster_answer1 not like", value, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1In(List<String> values) {
            addCriterion("poster_answer1 in", values, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1NotIn(List<String> values) {
            addCriterion("poster_answer1 not in", values, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1Between(String value1, String value2) {
            addCriterion("poster_answer1 between", value1, value2, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer1NotBetween(String value1, String value2) {
            addCriterion("poster_answer1 not between", value1, value2, "posterAnswer1");
            return (Criteria) this;
        }

        public Criteria andQuestionSortIsNull() {
            addCriterion("question_sort is null");
            return (Criteria) this;
        }

        public Criteria andQuestionSortIsNotNull() {
            addCriterion("question_sort is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionSortEqualTo(Integer value) {
            addCriterion("question_sort =", value, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortNotEqualTo(Integer value) {
            addCriterion("question_sort <>", value, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortGreaterThan(Integer value) {
            addCriterion("question_sort >", value, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_sort >=", value, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortLessThan(Integer value) {
            addCriterion("question_sort <", value, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortLessThanOrEqualTo(Integer value) {
            addCriterion("question_sort <=", value, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortIn(List<Integer> values) {
            addCriterion("question_sort in", values, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortNotIn(List<Integer> values) {
            addCriterion("question_sort not in", values, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortBetween(Integer value1, Integer value2) {
            addCriterion("question_sort between", value1, value2, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionSortNotBetween(Integer value1, Integer value2) {
            addCriterion("question_sort not between", value1, value2, "questionSort");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2IsNull() {
            addCriterion("poster_answer2 is null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2IsNotNull() {
            addCriterion("poster_answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2EqualTo(String value) {
            addCriterion("poster_answer2 =", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2NotEqualTo(String value) {
            addCriterion("poster_answer2 <>", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2GreaterThan(String value) {
            addCriterion("poster_answer2 >", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("poster_answer2 >=", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2LessThan(String value) {
            addCriterion("poster_answer2 <", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2LessThanOrEqualTo(String value) {
            addCriterion("poster_answer2 <=", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2Like(String value) {
            addCriterion("poster_answer2 like", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2NotLike(String value) {
            addCriterion("poster_answer2 not like", value, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2In(List<String> values) {
            addCriterion("poster_answer2 in", values, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2NotIn(List<String> values) {
            addCriterion("poster_answer2 not in", values, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2Between(String value1, String value2) {
            addCriterion("poster_answer2 between", value1, value2, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer2NotBetween(String value1, String value2) {
            addCriterion("poster_answer2 not between", value1, value2, "posterAnswer2");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3IsNull() {
            addCriterion("poster_answer3 is null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3IsNotNull() {
            addCriterion("poster_answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3EqualTo(String value) {
            addCriterion("poster_answer3 =", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3NotEqualTo(String value) {
            addCriterion("poster_answer3 <>", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3GreaterThan(String value) {
            addCriterion("poster_answer3 >", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("poster_answer3 >=", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3LessThan(String value) {
            addCriterion("poster_answer3 <", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3LessThanOrEqualTo(String value) {
            addCriterion("poster_answer3 <=", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3Like(String value) {
            addCriterion("poster_answer3 like", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3NotLike(String value) {
            addCriterion("poster_answer3 not like", value, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3In(List<String> values) {
            addCriterion("poster_answer3 in", values, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3NotIn(List<String> values) {
            addCriterion("poster_answer3 not in", values, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3Between(String value1, String value2) {
            addCriterion("poster_answer3 between", value1, value2, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer3NotBetween(String value1, String value2) {
            addCriterion("poster_answer3 not between", value1, value2, "posterAnswer3");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4IsNull() {
            addCriterion("poster_answer4 is null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4IsNotNull() {
            addCriterion("poster_answer4 is not null");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4EqualTo(String value) {
            addCriterion("poster_answer4 =", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4NotEqualTo(String value) {
            addCriterion("poster_answer4 <>", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4GreaterThan(String value) {
            addCriterion("poster_answer4 >", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4GreaterThanOrEqualTo(String value) {
            addCriterion("poster_answer4 >=", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4LessThan(String value) {
            addCriterion("poster_answer4 <", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4LessThanOrEqualTo(String value) {
            addCriterion("poster_answer4 <=", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4Like(String value) {
            addCriterion("poster_answer4 like", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4NotLike(String value) {
            addCriterion("poster_answer4 not like", value, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4In(List<String> values) {
            addCriterion("poster_answer4 in", values, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4NotIn(List<String> values) {
            addCriterion("poster_answer4 not in", values, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4Between(String value1, String value2) {
            addCriterion("poster_answer4 between", value1, value2, "posterAnswer4");
            return (Criteria) this;
        }

        public Criteria andPosterAnswer4NotBetween(String value1, String value2) {
            addCriterion("poster_answer4 not between", value1, value2, "posterAnswer4");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poster_question_details
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poster_question_details
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}